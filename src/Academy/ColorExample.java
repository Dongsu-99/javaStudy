package Academy;

import util.Color;

public class ColorExample {
    public static void main(String[] args) {
        Color c = Color.Black;
//        Color c1 = 30;
        Color c2 = null;
        Color c3 = Color.Yellow;

        System.out.printf("%s %d\n", c, c.ordinal());
        System.out.printf("%s %d\n", c3, c.ordinal()); //
    }

}
