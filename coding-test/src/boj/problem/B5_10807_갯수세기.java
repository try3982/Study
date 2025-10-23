package boj.problem;

import java.util.Scanner;

public class B5_10807_갯수세기 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int[] arr = new int[N];
        int count = 0;

        for (int i=1; i<=N; i++) {
            arr[i] = in.nextInt();
        }
        int v = in.nextInt();
        for (int i = 1; i<=arr.length; i++) {
            if (arr[i] == v) count++;
        }
        System.out.println(count);
    }
}
