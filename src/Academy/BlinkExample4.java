package Academy;

import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;



import util.Color;
import util.VT100;

public class BlinkExample4 {

    static Random r = new Random();

    static class Alpha extends TimerTask {

        int line;
        int column;
        Color fg;
        Color bg;
        String str;
        Direction direction;

        public Alpha() {

            line = r.nextInt(1, 20);
            column = r.nextInt(1, 40);
            do {
                fg = Color.values()[r.nextInt(8)];
                bg = Color.values()[r.nextInt(8)];
            } while (fg==bg);
            str = Language.values()[r.nextInt(3)].name();
            direction = Direction.values()[r.nextInt(4)];

        }

        void show() {
            VT100.cursorMove(line, column);
            VT100.setForeground(fg);
            VT100.setBackground(bg);
            VT100.print(str);


        }

        void hide() {
            for (int i=0; i<str.length(); i++) {
                VT100.cursorMove(line, column + i);
                VT100.reset();
                VT100.print(' ');
                System.out.flush();
            }
        }

        boolean blink = true;

        public void run() {

            hide();

            switch (direction) {
                case Right:
                    if (column < 40)
                        column++;
                    else
                        column = 1;

                    break;
                case Down:
                    if (line < 20)
                        line++;
                    else
                        line = 1;

                    break;
                case Left:
                    if (column > 1)
                        column--;
                    else
                        column = 40;

                    break;
                case Up:
                    if (line > 1)
                        line--;
                    else
                        line = 20;

                    break;
                default:
                    break;
            }

            show();

        }

    }

    static enum Language {
        Java, Python, Android
    }

    static enum Direction {
        Up, Down, Right, Left
    }


    public static void main(String[] args) throws InterruptedException {

        Timer timer = new Timer();

        VT100.clearScreen();
        VT100.reset();

        for (int i=0; i<5; i++) {
            Alpha a = new Alpha();
            timer.schedule(a, 0, r.nextInt(10, 1000));
        }


    }

}

