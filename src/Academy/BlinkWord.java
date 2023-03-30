package Academy;

import util.Color;
import util.VT100;

import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class BlinkWord {

    static class Blink extends TimerTask {
        static Random r = new Random();
        int line, column;
        Color fg, bg;
        String str;
        Direction direction;

        public Blink(String str) {
            line = r.nextInt(2, 20);
            column = r.nextInt(2, 40);
            do {
                fg = Color.values()[r.nextInt(8)];
                bg = Color.values()[r.nextInt(8)];
            } while (fg == bg);
//            str = Language.values()[r.nextInt(3)].name();
//            direction = Direction.values()[r.nextInt(4)];
        }

        void show() {
            VT100.cursorMove(line, column);
            VT100.setForeground(fg);
            VT100.setBackground(bg);
            VT100.print(str);
        }

        void hide() {

            for (int i = 0; i < str.length(); i++) {
                VT100.cursorMove(line, column + 1);
                VT100.reset();
                VT100.print(' ');
            }
            this.str = str;

        }

        boolean blink = true;

        static enum Direction {
            Left, Right, Up, Down
        }


        @Override
        public void run() {
            if (blink)
                show();
            else
                hide();

            blink = !blink;

        }


    }

    public static void main(String[] args) {
        VT100.reset();
        VT100.clearScreen();

        Timer timer = new Timer();

        Blink java = new Blink("Java");
        timer.schedule(java, 0, 100);

        Blink android = new Blink("Android");
        timer.schedule(android, 0, 500);

        Blink python = new Blink("Python");
        timer.schedule(python, 0, 1000);

        Blink linux = new Blink("Linux");
        timer.schedule(linux, 0, 300);
    }
}
