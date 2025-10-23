package boj.problem;

import java.util.Scanner;

public class B4_10039_평균점수 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int avg = 0;
        for(int i=1; i<=5; i++) {
            int score = in.nextInt();
            if(score < 40 ) {
                score = 40;
            }
            avg += score/5;
        }
        System.out.println(avg);
    }
}
