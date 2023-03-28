package baekjoon;
import java.util.Scanner;
public class baekjoon_4101 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (;;){
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (a == 0 && b == 0 ) {
                break;
            }
            if (a == b || a < b){
                System.out.println("No");
            }else
                System.out.println("Yes");
            }



        }
    }

