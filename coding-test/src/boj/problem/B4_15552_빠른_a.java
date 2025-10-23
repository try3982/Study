package boj.problem;

import java.io.*;
import java.util.StringTokenizer;

public class B4_15552_빠른_a {
    public static void main(String[] args) throws IOException {
        // 빠른 A + B
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());

        for(int i=0; i<T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
           bw.write(a+b + "\n");
        }
        bw.flush();
        bw.close();
    }
}
