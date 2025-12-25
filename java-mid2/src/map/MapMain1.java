package map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapMain1 {
    public static void main(String[] args) {
        Map<String, Integer> studentMap = new HashMap<>();

        // 학생의 성적 데이터
        studentMap.put("studnetA", 90);
        studentMap.put("studnetB", 80);
        studentMap.put("studnetC", 70);
        studentMap.put("studnetD", 60);
        System.out.println(studentMap);

        // 특정 학생의 값 조회
        Integer result = studentMap.get("studnetD");
        System.out.println("result + " + result);

        System.out.println("keySet 활용");
        Set<String> keySet = studentMap.keySet();
        for(String key : keySet) {
            System.out.println(key + " = " + studentMap.get(key));
        }

    }
}
