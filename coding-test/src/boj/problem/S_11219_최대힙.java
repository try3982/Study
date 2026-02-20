package boj.problem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

public class S_11219_최대힙 {
    public class Main {
        public static void main(String[] args) throws IOException {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringBuilder sb = new StringBuilder();

            int N = Integer.parseInt(br.readLine());

            // 최대 힙 생성
            PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

            for (int i = 0; i < N; i++) {

                int x = Integer.parseInt(br.readLine());

                if (x == 0) {
                    if (pq.isEmpty()) {
                        sb.append(0).append("\n");
                    } else {
                        sb.append(pq.poll()).append("\n");
                    }
                } else {
                    pq.offer(x);
                }
            }

            System.out.print(sb);
        }
    }
}