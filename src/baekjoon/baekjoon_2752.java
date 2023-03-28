package baekjoon;
import java.util.Scanner;
import java.util.Arrays;
public class baekjoon_2752 {
    public static void main(String[] args) {


        //배열받고 Array로 오름차순 정렬
        Scanner sc = new Scanner(System.in);
        int num[] =new int[3];


        for(int i = 0 ; i<3;i++){
            num[i] = sc.nextInt();
        }
        Arrays.sort(num); //

        for(int i = 0 ; i< 3; i++) {
            System.out.print(num[i] + " ");


        }




    }
}