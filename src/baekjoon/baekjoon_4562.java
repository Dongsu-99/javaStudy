package baekjoon;
import java.util.Scanner;
public class baekjoon_4562 {
//    첫번째 입력받은 수가 두번째 입력받은 수보다 작으면 "NO BRAINS", 아니면 "MMM BRAINS"을 출력하면 되는 간단한 문제입니다.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(true){
            int x =sc.nextInt();
            int y =sc.nextInt();
            System.out.println(x < y ? "NO":"MMM");
        }
    }


}
