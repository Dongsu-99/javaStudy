package baekjoon;

import java.util.Scanner;

public class backjoon_9713 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int line = sc.nextInt();


        for (int i = 1; i <= line; i++) { // 줄 생성
            int num = sc.nextInt(); // 입력할 숫자
            int number = 0;
            for (int j = 0; j <= num; j++) {
                if (j % 2 == 1)
                    number += j;
            }
            System.out.println(number);
        }
    }
}
