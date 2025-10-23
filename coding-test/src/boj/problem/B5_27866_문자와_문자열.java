package boj.problem;

import java.util.Scanner;

public class B5_27866_문자와_문자열 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String str = in.nextLine();
        int i = in.nextInt();

        System.out.println(str.charAt(i-1));

    }
}
