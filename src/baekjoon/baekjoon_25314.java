package baekjoon;

import java.util.Scanner;

public class baekjoon_25314 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String str = ""; // 단어 사이에 공백 필요하기 때문에 생성
        sc.close();

        for(int i=1; i<=n/4; i++) { // 수 나누기 4를 하였을때 수만큼 반복
            str += "long "; // 예로 20나누기 4는 5이므로 5번 반복 해서 long 출력
        }
        System.out.println(str + "int"); //이후 int만 따로 더해줌

    }
}