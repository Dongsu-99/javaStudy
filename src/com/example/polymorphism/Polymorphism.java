package com.example.polymorphism;
// 다형성 예시
public class Polymorphism {
    static class Vehicle{
        void drive(){
            System.out.println("드라이브 한다.");
        }

    }
    public abstract class sound{
        abstract void sound();
    }

    static class Car extends Vehicle{
        @Override
        void drive() {
            System.out.println("운전 한다.");
        }

    }
    static class MotorCycle extends Vehicle{
        @Override
        void drive() {
            System.out.println("오토바이");
        }
    }
    static class Airplane extends Vehicle{
        @Override
        void drive() {
            System.out.println("비행기");

        }
    }
    public static void main(String[] args) {
        Vehicle v1 = new Car();
        Vehicle v2 = new MotorCycle();
        Vehicle v3 = new Airplane();

        v1.drive();
        v2.drive();
        v3.drive();

        run(v1);
        run(v2);
        run(v3);
    }
    static void run(Vehicle v){ //매개변수의 다형성
        v.drive();
        System.out.println(v instanceof Car); // 체크위한 연산자 == instanceof
    }
}
