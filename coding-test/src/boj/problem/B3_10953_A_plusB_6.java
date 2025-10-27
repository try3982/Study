package boj.problem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class B3_10953_A_plusB_6 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for(int i =0; i<T; i++) {
            String[] numbers = br.readLine().split(",");
            int A = Integer.parseInt(numbers[0]);
            int B = Integer.parseInt(numbers[1]);
            System.out.println(A+B);
        }
    }
}
