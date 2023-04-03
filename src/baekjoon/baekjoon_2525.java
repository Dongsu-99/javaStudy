package baekjoon;
import java.util.Scanner;

public class baekjoon_2525 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int h = sc.nextInt();
            int m = sc.nextInt();
            int n = sc.nextInt();


            // 시간과 분을 전부 분으로 만들고 계산하기
            int a = h*60 + m + n;
            h = a/60;
            m = a%60;

            //24시를 지나게되면 0으로 돌아가야함
            if (h>=24) {
                h= h-24;
            }

            System.out.println(h + " "+ m);

        }
    }