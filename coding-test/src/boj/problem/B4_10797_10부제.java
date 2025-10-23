package boj.problem;

import java.util.Scanner;

public class B4_10797_10부제 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int Date1 = in.nextInt();

        int[] arr = new int[5];
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
            if (arr[i] == Date1) {
                count++;
            }
        }
        System.out.println(count);
    }
}
