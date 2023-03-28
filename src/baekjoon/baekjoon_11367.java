package baekjoon;

import java.util.Scanner;

public class baekjoon_11367 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int line = sc.nextInt(); // 줄 생성
        int n = 0;
        for (int i = 0; i < line; i++) {
            String a = sc.next(); // 이름 입력
            int b = sc.nextInt();
            if (b <= 59) {
                System.out.println(a + " " + "F");
            } else if (b <= 66) {
                System.out.println(a + " "+ "D");
            } else if (b <= 69) {
                System.out.println(a + " "+ "D+");
            } else if (b <= 76) {
                System.out.println(a + " "+ "C");
            } else if (b <= 79) {
                System.out.println(a + " "+ "C+");
            } else if (b <= 86) {
                System.out.println(a + " "+ "B");
            } else if (b <= 89) {
                System.out.println(a + " "+ "B+");
            } else if (b <= 96) {
                System.out.println(a + " "+ "A");
            } else if(b <= 100){
                System.out.println(a + " "+ "A+");
            }


        }
        sc.close();
    }
}

//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        int line = sc.nextInt();
//
//        while (line-- > 0) {
//            String name = sc.next();
//            int score = sc.nextInt();
//
//            if (score >= 0 && score <= 100) {
//                System.out.print(name + " ");
//                result(score);
//            }
//        }
//        sc.close();
//    }
//
//    public static void result(int score) {
//        String c;
//
//        if (score >= 97 && score <= 100) {
//            c = "A+";
//        } else if (score > 89 && score < 97) {
//            c = "A";
//        } else if (score > 86 && score < 90) {
//            c = "B+";
//        } else if (score > 79 && score < 87) {
//            c = "B";
//        } else if (score > 76 && score < 80) {
//            c = "C+";
//        } else if (score > 69 && score < 77) {
//            c = "C";
//        } else if (score > 66 && score < 70) {
//            c = "D+";
//        } else if (score > 59 && score < 67) {
//            c = "D";
//        } else if (score >= 0 && score < 60) {
//            c = "F";
//        } else {
//            c = "";
//        }
//
//        System.out.println(c);
//    }
//}
//
