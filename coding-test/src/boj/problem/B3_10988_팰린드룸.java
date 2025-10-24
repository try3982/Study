package boj.problem;

import java.util.Scanner;

public class B3_10988_팰린드룸 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String word = in.nextLine();

        boolean isPalindrome = true;

        for (int i = 0; i < word.length() / 2; i++) {
            if (word.charAt(i) != word.charAt(word.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println(isPalindrome ? 1 : 0);
    }
}
