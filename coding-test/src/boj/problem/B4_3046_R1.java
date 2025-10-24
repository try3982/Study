package boj.problem;

import java.util.Scanner;

public class B4_3046_R1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int R1 = in.nextInt();
        int S = in.nextInt();
        int R2 = 2 * S - R1;
        System.out.println(R2);
    }
}
