package boj.problem;

import java.util.Scanner;

public class B4_25304_영수증 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int totalX = in.nextInt();
        int kindN = in.nextInt();
        int sum = 0;


        for (int i = 1; i <= kindN; i++) {
            int price = in.nextInt();
            int quantity = in.nextInt();
            sum += price * quantity;
        }

        if (totalX == sum) {
            System.out.println("Yse");
        } else {
            System.out.println("No");
        }
    }
}
