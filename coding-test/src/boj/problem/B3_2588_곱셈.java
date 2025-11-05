package boj.problem;

import java.util.Scanner;

public class B3_2588_곱셈 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int first = in.nextInt();
        char[] second = in.next().toCharArray();
        int sum = 0;
        int su = 1;
        for (int i = 2; i >= 0; i--) {
            int temp = Integer.parseInt(String.valueOf(second[i]));
            System.out.println(first * temp);
            sum += (first * temp) * su;
            su= su * 10;
        }
        System.out.println(sum);
    }
}
