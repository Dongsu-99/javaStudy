package baekjoon;
import java.util.Scanner;
public class baekjoon_4562 {
//    첫번째 입력받은 수가 두번째 입력받은 수보다 작으면 "NO BRAINS", 아니면 "MMM BRAINS"을 출력
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i<n; i++){
            int x =sc.nextInt();
            int y =sc.nextInt();
            System.out.println(x < y ? "NO BRAINS":"MMM BRAINS");
        }


    }


}
