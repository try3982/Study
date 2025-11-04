package boj.정렬;

import java.util.Arrays;
import java.util.Scanner;

public class B2_5576_콘테스트 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] arr1 = new int[10];
        int[] arr2 = new int[10];

        for (int i = 0; i < 10; i++) {
            arr1[i] = in.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            arr2[i] = in.nextInt();
        }

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int sumW = arr1[9] + arr1[8] + arr1[7];
        int sumK = arr2[9] + arr2[8] + arr2[7];

        System.out.println(sumW + " " + sumK);
    }
}
