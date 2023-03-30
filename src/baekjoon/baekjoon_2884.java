package baekjoon;

import java.util.Scanner;

public class baekjoon_2884 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int H = in.nextInt(); // 시
        int M = in.nextInt(); // 분
        in.close();

        if(M < 45) {
            H--;		// 시 감소
            M= 60 - (45 - M); 	// 분 감소
            if(H < 0) {
                H = 23;
            }
            System.out.println(H + " " + M);
        }
        else { // M 이 45보다 클 경우
            System.out.println(H + " " + (M - 45));
        }
    }
}