package baekjoon;
import java.util.Scanner;
//        국제 표준 도서 번호(ISBN)는 책을 식별하기 위한 13자리 번호입니다. 이 번호에는 번호가 제대로 쓰인 것인지 확인할 수 있는 특별한 성질이 숨겨져 있습니다.

//        13자리 숫자의 1-3 합은 각 자리를 번갈아 1과 3으로 곱한 후 (예시를 참고합시다.) 그 값들을 더해 구할 수 있습니다.
//        예를 들어, 9780921418948의 1-3 합은 아래와 같은 덧셈을 통해 120임을 알 수 있습니다.
//        9 ∗ 1 + 7 ∗ 3 + 8 ∗ 1 + 0 ∗ 3 + 9 ∗ 1 + 2 ∗ 3 + 1 ∗ 1 + 4 ∗ 3 + 1 ∗ 1 + 8 ∗ 3 + 9 ∗ 1 + 4 ∗ 3 + 8 ∗ 1
//        ISBN의 특별한 성질은 1-3 합이 언제나 10의 배수라는 것입니다.
//        13자리 수의 1-3 합을 계산하는 프로그램을 작성합시다. 타자 양을 줄이기 위해, 첫 열 개의 자리는 언제나 위의 예시와 같이 9780921418이라 가정합시다.
//        당신의 프로그램은 마지막 세 자리를 입력 받아 1-3 합을 출력해야 합니다. 아래의 예제와 같은 형식으로 출력합시다.
public class baekjoon_6810 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.print("The 1-3-sum is ");
        System.out.print(91 +a*1 + b*3+c*1);

    }
}