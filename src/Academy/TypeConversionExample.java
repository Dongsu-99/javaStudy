package Academy;

public class TypeConversionExample {
    static class Parent{

    }
    static class Child extends Parent{

    }
    static class Child2 extends Parent{

    }
    public static void main(String[] args) {
        Child c = new Child();
        Child c1 = new Child();
        Child2 c2 = new Child2();
        Parent p1 = c; // 상속받고 있기 때문에 문제없음
        p1 = c2;
        p1 = c1;
    }
}
