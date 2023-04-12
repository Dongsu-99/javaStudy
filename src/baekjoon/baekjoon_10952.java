package baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class baekjoon_10952 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        StringTokenizer st;


        for(;;) {
            str = br.readLine();
            st = new StringTokenizer(str, " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            if (a + b == 0) {
                break;
            }
            System.out.println(a+b);
        }
    }
}
