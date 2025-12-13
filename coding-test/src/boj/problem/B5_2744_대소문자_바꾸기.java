package boj.problem;

import java.util.Scanner;

public class B5_2744_대소문자_바꾸기 {

    public static void main(String[] args) {
        Scanner  in = new Scanner(System.in);
        String word = in.nextLine();

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i< word.length(); i++) {
            char c = word.charAt(i);

            if(Character.isUpperCase(c)) {
                sb.append(Character.toLowerCase(c));
            }else {
                sb.append(Character.toUpperCase(c));
            }
        }
        System.out.println(sb.toString());
    }
}
