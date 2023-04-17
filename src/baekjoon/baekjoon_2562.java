package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class baekjoon_2562 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int array[] = {sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt(),
                sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt(),};

        int count = 0;
        int max = 0;
        int index = 0;

        for(int value : array) {
            count++;

            if(value > max) {
                max = value;
                index = count;
            }
        }
        System.out.print(max + "\n" + index);
    }
}
