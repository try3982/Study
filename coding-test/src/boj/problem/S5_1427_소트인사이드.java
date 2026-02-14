package boj.problem;

import java.util.Arrays;
import java.util.Scanner;

public class S5_1427_소트인사이드 {
    public static void main(String[] args) {
        //배열을 정렬하는 것은 쉽다. 수가 주어지면, 그 수의 각 자리수를 내림차순으로 정렬해보자.
        Scanner in = new Scanner(System.in);
        String n = in.nextLine();
        char[] arr = n.toCharArray();
        Arrays.sort(arr);
        StringBuilder sb = new StringBuilder(new String(arr));
        sb.reverse();
        System.out.println(sb.toString());
    }
}

