package baekjoon;

import java.util.Scanner;


public class baekjoon_10817 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int second = 0; // 결과값 초기화

        if (a >= b) {
            if (a >= c) {
                if (b >= c)
                    second =b;
                else
                    second =c;
            } else
                    second =a;
        } else {
            if (c <= b) {
                if (c <= a)
                    second = a;
                else
                    second = c;
            } else
                    second = b;
        }
        System.out.println(second);
    }

}