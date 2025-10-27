package boj.problem;

import java.util.Scanner;

public class B3_10872_팩토리얼 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        if (n < 2) {
            System.out.println(1);
        } else {
            int fac = 1;
            for (int i = 2; i <= n; i++) {
              fac = fac * i;
            }
            System.out.println(fac);
        }

    }
}
