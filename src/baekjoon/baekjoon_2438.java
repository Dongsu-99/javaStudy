package baekjoon;

import java.util.Scanner;

public class baekjoon_2438 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i =1; i<= T;i++){
            for(int j =1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
