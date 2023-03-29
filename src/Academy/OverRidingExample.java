package Academy;

public class OverRidingExample {
    static class Shape {
        public void show(){
            System.out.println("도형 그리기");
        }
        private void hide(){
            System.out.println("도형 지우기");
        }
    }

    static class Circle extends Shape {

        public void show(){
            System.out.println("원 그리기");  //자식메소드에 부모메소드 오버라이딩 (덮어씌우기)
        }
       public void hide(){
            System.out.println("원 지우기");
        }
    }

    public static void main(String[] args) {
        Circle c = new Circle();
        c.show();
        c.hide();
    }
}
