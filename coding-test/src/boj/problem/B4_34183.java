package boj.problem;

import java.util.Scanner;

public class B4_34183 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int M = in.nextInt();
        int A = in.nextInt();
        int B = in.nextInt();

        int needChair = N *3;   // 총 필요한 의자
        int buyChair = needChair - M;  // 사야할 의자 갯수
        int price = buyChair * A;
        int anwser = price + B;

        if(buyChair <= 0) {
            System.out.println(0);
        }else {
            System.out.println(anwser);
        }
    }
}