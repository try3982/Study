package boj.정렬;

import java.util.Arrays;
import java.util.Scanner;

public class B3_2309_일곱난쟁이 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 9;

        int[] arr = new int[n];
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
            sum += arr[i];
        }

        Arrays.sort(arr);

        int fake1 = 0, fake2 = 0;
        boolean found = false;

        // 두 명 찾기
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (sum - arr[i] - arr[j] == 100) {
                    fake1 = i;
                    fake2 = j;
                    found = true;
                    break;
                }
            }
            if (found) break;
        }

        // 출력 (일곱 명)
        for (int i = 0; i < n; i++) {
            if (i == fake1 || i == fake2) continue;
            System.out.println(arr[i]);
        }
    }
}
