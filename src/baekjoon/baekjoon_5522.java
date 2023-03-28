package baekjoon;
import java.util.Scanner;
public class baekjoon_5522 {
    public static void main(String[] args) {
//        JOI군은 카드 게임을 하고 있다. 이 카드 게임은 5회의 게임으로 진행되며, 그 총점으로 승부를 하는 게임이다.
//        JOI군의 각 게임의 득점을 나타내는 정수가 주어졌을 때, JOI군의 총점을 구하는 프로그램을 작성하라.
        Scanner sc = new Scanner(System.in);

        //1 ~5 다 더해서 15 나오게 하면 된다.
        int result= 0;// 결과값 정수 선언
        for(int i =1; i<=5;i++) // 5번 입력할수있음

            result =result + sc.nextInt(); //결과 + 입력한 수
            System.out.println(result); //결과 출력




    }
}
