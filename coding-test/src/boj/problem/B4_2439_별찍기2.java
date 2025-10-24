package boj.problem;

import java.util.Scanner;

public class B4_2439_별찍기2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();

        for (int i = N; i > 0; i--) { // n이 5 4 3 2 1
            for (int j = 1; j <= N; j++) { // 1 2 3 4 5
                if (j >= i) System.out.print("*");
                else System.out.println(" ");
            }
            System.out.println();
        }
    }
}
