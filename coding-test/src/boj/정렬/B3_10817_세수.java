package boj.정렬;

import java.util.Arrays;
import java.util.Scanner;

public class B3_10817_세수 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

       int[] arr = new int[3];
       for (int i = 0; i < arr.length; i++) {
           arr[i] = in.nextInt();
       }
       Arrays.sort(arr);
        System.out.println(arr[1]);
    }
}
