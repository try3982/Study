package boj.problem;

import java.util.Scanner;

public class B3_2562_최댓값 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int max = -1;
        int maxIndex = 0;

        for (int i = 0; i < 9; i++) {
            int nums = in.nextInt();
            if (nums > max) {
                max = nums;
                maxIndex = i;
            }
        }
        System.out.println(maxIndex);
    }

}
