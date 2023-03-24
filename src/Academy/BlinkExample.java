package Academy;

import util.VT100;

import java.util.Random;

public class BlinkExample {
    static class Alpha { // 충돌 피하기 위해 안에 생성
        int line;          //속성 ==> 필드
        int column;
        int fg;
        int bg;
        char ch;

        long previousMillis;
        boolean isShow = true;
        int cycle;

        Alpha() {            //생성자 constructor (초기화메서드)
            Random r = new Random();
            line = r.nextInt(1, 21);
            column = r.nextInt(1, 41);

            do {
                fg = r.nextInt(31, 38);
                bg = r.nextInt(41, 48);
            } while (fg + 10 == bg);

            ch = (char) r.nextInt('A', 'Z' + 1);

            previousMillis = System.currentTimeMillis();
            cycle = r.nextInt(100,600);
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


        void blink() {
            long currentMillis = System.currentTimeMillis();

            if (currentMillis - previousMillis >= cycle) {
                previousMillis = currentMillis;
                if(isShow)
                    show();
                else
                    hide();

                isShow = !isShow;
            }
        }
    }


    public static void main(String[] args) {

        VT100.reset();
        VT100.clearScreen();
        Alpha a = new Alpha();
        Alpha b = new Alpha();
        Alpha c = new Alpha();
        for (; ; ) {
            a.blink();
            b.blink();
            c.blink();

        }

//        a.Alpha();// (X) 한번 초기화된 인스턴스는 다시 호출불가
    }
}
