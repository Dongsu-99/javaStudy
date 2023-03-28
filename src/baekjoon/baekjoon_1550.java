package baekjoon;
import java.util.Scanner;
public class baekjoon_1550 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String a = sc.next();
        int b = Integer.parseInt(a,16);
        System.out.println(b);
        sc.close();
    }
}
//Integer.parseInt()는 자바 내장 함수로서 2진수, 8진수, 16진수를 10진수로 변환 할때 사용 해줄 수 있다. parseInt는 String Type을 Int Type로 변환시켜주는 역할을 담당하며,
//        Integer.parseInt(String Type, n진수)의 형태로 사용된다. return값은 당연히 int로 적용되게 된다.