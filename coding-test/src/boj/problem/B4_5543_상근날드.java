package boj.problem;

import java.util.Scanner;

public class B4_5543_상근날드 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int b1 = in.nextInt();
        int b2 = in.nextInt();
        int b3 = in.nextInt();
        int d1 = in.nextInt();
        int d2 = in.nextInt();

        int minBurger = Math.min(b1, Math.min(b2,b3));
        int minDrink = Math.min(d1, d2);

        int setPrice = minBurger + minDrink - 50;
        System.out.println(setPrice);

    }
}
