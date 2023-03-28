package Academy;

import java.time.LocalDate;


class Earth {

    int line;
    int column;

    static private Earth earth = new Earth();

    private Earth() {

    }

    public static Earth getInstance() {
        return earth;
    }
}

public class SingletonExample {


    public static void main(String[] args) {

//            Earth a = new Earth();
//            Earth b = new Earth();

        Earth a = Earth.getInstance();
        Earth b = Earth.getInstance();
        LocalDate date = LocalDate.now();

        System.out.println(a == b);
        System.out.println(date);
    }
}


