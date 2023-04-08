package baekjoon;


import java.io.*;
import java.util.StringTokenizer;

public class baekjoon_11021 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());

        for (int i =0; i<T; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = i + 1;

            bw.write("Case #"+c+": "+(a+b)+"\n");
//            bw.newLine(); // \n 대신 사용가능

        }
        bw.close();


    }
}
