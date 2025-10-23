package boj.problem;

import java.util.Scanner;

public class B5_2744_대소문자_바꾸기 {
    public static void main(String[] args) {
        //영어 소문자와 대문자로 이루어진 단어를 입력받은 뒤, 대문자는 소문자로, 소문자는 대문자로 바꾸어 출력하는 프로그램을 작성하시오.
        Scanner in = new Scanner(System.in);
        char[] text = in.nextLine().toCharArray();

        for (int i = 0; i < text.length; i++) {
            char temp = text[i];
            if (temp >= 'a' && temp <= 'z') {
                System.out.println((char) (temp -= 32));
            } else {
                System.out.println((char) (temp + 32));
            }
        }
    }
}
