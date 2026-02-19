package boj.problem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class S2_1541_잃어버린_괄호 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        // 1. '-' 기준으로 나누기
        String[] minusSplit = input.split("-");

        int result = 0;

        // 2. 첫 번째 덩어리는 그냥 더하기
        String[] first = minusSplit[0].split("\\+");
        for (String num : first) {
            result += Integer.parseInt(num);
        }

        // 3. 두 번째 덩어리부터는 전부 더해서 빼기
        for (int i = 1; i < minusSplit.length; i++) {

            int sum = 0;
            String[] plusSplit = minusSplit[i].split("\\+");

            for (String num : plusSplit) {
                sum += Integer.parseInt(num);
            }

            result -= sum;
        }

        System.out.println(result);
    }
}
