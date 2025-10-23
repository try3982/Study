package boj.problem;

import java.util.Scanner;

public class B4_10156_과자 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int K = in.nextInt();
        int N = in.nextInt();
        int M = in.nextInt();

        int total = K * N;
        int umka = total - M;

        if (umka < 0) {
            umka = 0;
        }

        System.out.println(umka);
    }
}
