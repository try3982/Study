package boj.problem;

import java.util.Scanner;

public class B4_2742_기찍N {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int N  = in.nextInt();

//        while(true) {
//            if(N == 0) {
//                break;
//            }
//            System.out.println(N);
//            N--;
//        }

        for(int i = N; i >= 1; i--) {
            System.out.println(i);
        }
    }
}
