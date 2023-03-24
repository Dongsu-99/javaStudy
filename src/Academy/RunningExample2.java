package Academy;

import util.VT100;

import java.util.Random;

public class RunningExample2 {

    static int ranking=0;
    static class Alpha { // 충돌 피하기 위해 안에 생성
        int line;          //속성 ==> 필드
        int column;
        int fg;
        int bg;
        char ch;


        long previousMillis;
        int cycle;
        Random r = new Random();


        Alpha(int line, int column, char ch) {            //생성자 constructor (초기화메서드)

            this.line = line;
            this.column = column;

            do {
                fg = r.nextInt(31, 38);
                bg = r.nextInt(41, 48);
            } while (fg + 10 == bg);

            this.ch = ch;

            previousMillis = System.currentTimeMillis();
            cycle = r.nextInt(300, 1000);

            show();
        }

        void show() {            //동작 ==> 메소드
            VT100.cursorMove(line, column);
            VT100.setForeground(fg);
            VT100.setBackground(bg);
            System.out.print(ch);
        }

        void hide() {
            VT100.cursorMove(line, column);
            VT100.reset();
            System.out.print(' ');
        }

        void run() {
            if (column == 80) {

                return;
            }
            long currentMillis = System.currentTimeMillis();
            if (currentMillis - previousMillis >= cycle) {
                previousMillis = currentMillis;

                hide();
                column++;
                show();

                if(column == 80){
                    ranking++;
                    VT100.cursorMove(line,column +2);
                    VT100.reset();
                    System.out.printf("%d 등", ranking );
                }

                cycle = r.nextInt(300,1000);
            }


        }
//        void blink() {
//            long currentMillis = System.currentTimeMillis();
//
//            if (currentMillis - previousMillis >= cycle) {
//                previousMillis = currentMillis;
//
//            }
//        }
    }


    public static void main(String[] args) {

        VT100.reset();
        VT100.clearScreen();

        Alpha a = new Alpha(5, 10, 'A');
        Alpha b = new Alpha(6, 10, 'B');
        Alpha c = new Alpha(7, 10, 'C');
        Alpha d = new Alpha(8, 10, 'D');
        Alpha e = new Alpha(9, 10, 'E');
        Alpha f = new Alpha(10, 10, 'F');
        for (; ; ) { // SuperLoop 사용중에는 sleep 사용금지
            a.run();
            b.run();
            c.run();
            d.run();
            e.run();
            f.run();

            if(ranking == 6){
                break;
            }

        }
        VT100.reset();
        VT100.cursorMove(12, 1);
        System.out.println("Running End...");
    }
}



//        a.Alpha();// (X) 한번 초기화된 인스턴스는 다시 호출불가



