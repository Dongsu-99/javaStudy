package baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class baekjoon_11022 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st;

        int T = Integer.parseInt(br.readLine());

        for(int i =0; i< T; i++){ // 테스트 케이스 반복
            int x = 1 + i; // case "#" = x
            st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken());// 입력값
            int b = Integer.parseInt(st.nextToken());

            int c = a + b;

            bw.write("Case #"+x+": "+ a +" + "+ b +" = "+c+"\n");
        }
            bw.close();
    }
}
