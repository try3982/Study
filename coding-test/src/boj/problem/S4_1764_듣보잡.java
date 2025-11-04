package boj.problem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class S4_1764_듣보잡 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int M = in.nextInt();
        in.nextLine(); // 개행 제거

        // 듣도 못한 사람 집합
        HashSet<String> unheard = new HashSet<>();
        for (int i = 0; i < N; i++) {
            unheard.add(in.nextLine());
        }

        // 교집합 수집
        ArrayList<String> both = new ArrayList<>();
        for (int i = 0; i < M; i++) {
            String name = in.nextLine();
            if (unheard.contains(name)) {
                both.add(name);
            }
        }

        // 사전순 정렬
        Collections.sort(both);

        // 출력
        System.out.println(both.size());
        for (String name : both) {
            System.out.println(name);
        }
    }
}


//import java.io.*;
//        import java.util.*;

//public class Main {
//    public static void main(String[] args) throws Exception {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        int N = Integer.parseInt(st.nextToken());
//        int M = Integer.parseInt(st.nextToken());
//
//        HashSet<String> unheard = new HashSet<>(Math.max(16, (int)(N / 0.75) + 1));
//        for (int i = 0; i < N; i++) {
//            unheard.add(br.readLine());
//        }
//
//        ArrayList<String> both = new ArrayList<>();
//        for (int i = 0; i < M; i++) {
//            String name = br.readLine();
//            if (unheard.contains(name)) both.add(name);
//        }
//
//        Collections.sort(both);
//
//        StringBuilder sb = new StringBuilder();
//        sb.append(both.size()).append('\n');
//        for (String name : both) sb.append(name).append('\n');
//        System.out.print(sb.toString());
//    }
//}
