package boj.problem;

import java.util.Scanner;

public class B5_2420_사파리월드 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long N = in.nextInt();
        long M = in.nextInt();
        System.out.println(Math.abs(N-M));
    }
}
