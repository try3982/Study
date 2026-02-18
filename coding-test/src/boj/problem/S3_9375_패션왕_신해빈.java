package boj.problem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class S3_9375_패션왕_신해빈 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine()); // 테스트 케이스 수

        while (T-- > 0) {

            int n = Integer.parseInt(br.readLine());

            Map<String, Integer> map = new HashMap<>();

            // 1. 종류별 개수 카운트
            for (int i = 0; i < n; i++) {
                String[] input = br.readLine().split(" ");
                String type = input[1];  // 의상 종류

                map.put(type, map.getOrDefault(type, 0) + 1);
            }

            int result = 1;

            // 2. (개수 + 1) 곱하기
            for (int count : map.values()) {
                result *= (count + 1);
            }

            // 3. 알몸 제외
            sb.append(result - 1).append("\n");
        }

        System.out.print(sb);
    }
}
