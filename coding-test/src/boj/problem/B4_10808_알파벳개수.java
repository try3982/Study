package boj.problem;

import java.util.Scanner;

public class B4_10808_알파벳개수 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char[] text = in.nextLine().toCharArray();

        int[] count = new int[26];

        for (int i = 0; i < text.length; i++) {
            count[text[i] - 97]++;
        }

        for(int i=0; i<count.length; i++) {
            System.out.print(count[i]+ " ");
        }
    }
}
