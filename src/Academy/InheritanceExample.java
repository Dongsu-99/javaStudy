package Academy;

import util.Color;

public class InheritanceExample {
    static class Shape {
        int line;
        int column;
        Color fg;
        Color bg;

        public Shape(int line, int column) {
            System.out.println("Shape()...");
        }

        void show() {

        }

        void hide() {

        }

        static class Triangle extends Shape {
            public Triangle() {
                super(10, 20); // 부모의 생성자 호출 = super  나의 또다른 생성자 호출 =this

                System.out.println("Triangle ()...");
            }

        }

        static class Circle extends Shape {
            public Circle(){// 자동 생성
                super(10,20); //자동 생성
            }
        }

        static class Rectangle extends Shape {
            public Rectangle() {
                super(10,20);
            }
        }

        public static void main(String[] args) {

            Triangle t1 = new Triangle(); // 자식 인스턴스 생성시 부모도 생성


            t1.line = 10;
            t1.column = 20;
            t1.bg = Color.Black;
            t1.fg = Color.Yellow;
            t1.show();
            t1.hide();

        }
    }
}
