package boj.problem;

import java.util.Arrays;
import java.util.Scanner;

public class S5_11650_좌표정렬하기 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int[][] points = new int[n][2];

        for (int i = 0; i < n; i++) {
            points[i][0] = in.nextInt();
            points[i][1] = in.nextInt();
        }

        Arrays.sort(points, (a, b) -> {
            if (a[0] != b[0]) {
                return a[0] - b[0]; // x 좌표 비교
            }else {
                return a[1] - b[1];
            }
        });

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < n; i++) {
            sb.append(points[i][0] + " " + points[i][1]).append('\n');
        }
        System.out.println(sb);
    }
}
