package Academy;

import util.Color;
import util.VT100;


public class VT100Example {
    static class A extends BankApplication {

    }

    static class B {

    }/*extends Math*/ //private 으로 선언된 라이브러리 이기 때문에 상속 불가

    public static void main(String[] args) {
        VT100.clearScreen();

        VT100.cursorMove(10,10);
        VT100.setForeground(Color.Black);
        VT100.setBackground(Color.Red);
        VT100.println('a');
        VT100.println("Hello World");

        VT100.reset();

    }
}
