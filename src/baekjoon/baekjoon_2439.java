package baekjoon;

import java.util.Scanner;

public class baekjoon_2439 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int i =1 ; i<=T; i++){
            for (int j = T; j>0; j--){
                if (j <= i){
                    System.out.print("*");
                }else
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
