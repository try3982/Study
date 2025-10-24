package boj.problem;

import java.util.Scanner;

public class B3_11721_열개씩끊어출력하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        sc.close();

        for (int i = 0; i < word.length(); i += 10) {
            int end = Math.min(i + 10, word.length());
            System.out.println(word.substring(i, end));
        }
    }
}
