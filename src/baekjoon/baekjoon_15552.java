package baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class baekjoon_15552 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //선언
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st;
        int T = Integer.parseInt(br.readLine()); //테스트 케이스 T

        for (int i = 1; i <= T; i++) { // T까지 반복
            st = new StringTokenizer(br.readLine());
            bw.write((Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken())) + "\n");
        }               //첫번째값                                      두번째값                    println이랑 다르게 자동 줄 바꿈이 없기 때문에 추가

        bw.close();


    }
}
