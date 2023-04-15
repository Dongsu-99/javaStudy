package baekjoon;

import java.util.Scanner;

public class baekjoon_10871 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        int x = sc.nextInt();

        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
            if (array[i] < x) {
                System.out.print(array[i] + " ");
            }


        }

    }
}
