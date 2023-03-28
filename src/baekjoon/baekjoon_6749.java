package baekjoon;

import java.util.Scanner;

public class baekjoon_6749 {
    //문제
    //
    //세 아이가 사는 가족이 있습니다. 셋의 나이는 등차수열을 이룹니다: 둘째 아이와 막내의 나이 차이는 첫째 아이와 둘째 아이의 나이 차이와 같습니다.
    // 예를 들어 세 아이의 나이는 5, 10, 15가 될 수 있는데, 인접한 둘의 나이 차이가 항상 5이기 때문입니다.
    //
    //막내와 둘째 아이의 나이가 주어질 때, 첫째 아이의 나이는 얼마일까요?
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int F = 0;
        int Y = sc.nextInt();
        int M = sc.nextInt();

        // M - Y = F

        System.out.println((M-Y)+M);
    }
}
