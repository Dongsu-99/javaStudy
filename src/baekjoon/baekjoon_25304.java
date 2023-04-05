package baekjoon;

import java.util.Scanner;

public class baekjoon_25304 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long total;
        int line, price, number, sum = 0;
        total = sc.nextLong();
        line = sc.nextInt();

        for (int i = 0; i < line; i++) {
            price = sc.nextInt();
            number = sc.nextInt(); //라인 수만큼 반복입출력
            sum += (price * number);
        }
            if (sum == total) {
                System.out.println("Yes");
            } else
                System.out.println("No");
        }
    }


