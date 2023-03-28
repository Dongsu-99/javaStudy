package Academy;

public class GetterSetterExample {
    class Alpha{
        private int line;
        private int column;
        private int fg;
        private int bg;
        private char ch;
        private boolean blink;

        public int getLine() {
            return line;
        }

        public void setLine(int line) {
            this.line = line;
        }

        public int getColumn() {
            return column;
        }

        public void setColumn(int column) {
            this.column = column;
        }

        public int getFg() {
            return fg;
        }

        public void setFg(int fg) {
            this.fg = fg;
        }

        public int getBg() {
            return bg;
        }

        public void setBg(int bg) {
            this.bg = bg;
        }

        public char getCh() {
            return ch;
        }

        public void setCh(char ch) {
            this.ch = ch;
        }

        public boolean isBlink() {
            return blink;
        }

        public void setBlink(boolean blink) {
            this.blink = blink;
        }
    }
    public static void main(String[] args) {

    }
}
