package boj.정렬;

import java.util.Arrays;
import java.util.Scanner;

public class B1_2693_N번째_큰수 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();

        for (int tc = 0; tc < T; tc++) {
            int[] arr = new int[10];
            for (int j = 0; j < 10; j++) {
                arr[j] = in.nextInt();
            }

            Arrays.sort(arr);
            System.out.println(arr[7]);
        }

        in.close();

    }
}
