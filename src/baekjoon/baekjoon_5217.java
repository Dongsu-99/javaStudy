package baekjoon;
import java.util.Scanner;

public class baekjoon_5217 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int TC = in.nextInt(); //테스트 케이스의 개수 파악

        for(int i=1;i<=TC;i++){ //테스트 케이스만큼 동작

            int n = in.nextInt();    //쌍을 만들 숫자
            int A = 0;
            System.out.print("Pairs for "+n+": ");
            while(true){ //if문이 동작할 때까지 반복하는 반복문

                A = A+1;
                int B = n - A;

                if(A==B || A>B){ //A와 B가 같거나 A가 더 높을 때 while문의 동작을 멈춘다.
                    break;
                }

                if(2<=A){ //만약 여러개일 경우 뒤에 ,을 붙여준다.
                    System.out.print(", ");
                }
                System.out.print(A+" "+B);
            }
        }


    }
}