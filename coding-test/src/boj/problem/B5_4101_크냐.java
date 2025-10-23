package boj.problem;

import java.util.Scanner;

public class B5_4101_크냐 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while(true) {
            int a = in.nextInt();
            int b = in.nextInt();

            if(a  == 0 && b == 0) {
                break;
            }
            if(a > b) {
                System.out.println("Yes");

            }else {
                System.out.println("No");
            }
        }
    }
}
