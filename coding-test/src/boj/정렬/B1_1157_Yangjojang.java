package boj.정렬;

import java.util.Scanner;

public class B1_1157_Yangjojang {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();

        for (int tc = 0; tc < T; tc++) {
            int N = in.nextInt();

            String maxSchool = "";
            int maxDrink = -1;

            for (int i = 0; i < N; i++) {
                String school = in.next();
                int drink = in.nextInt();

                if (drink > maxDrink) {
                    maxDrink = drink;
                    maxSchool = school;
                }
            }
            System.out.println(maxSchool);
        }
        in.close();
    }
}
