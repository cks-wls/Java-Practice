package middle2.collection.map.test;

import java.util.HashMap;
import java.util.Map;

public class CommonKeyValueSum1 {

    public static void main(String[] args) {
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("A", 1);
        map1.put("B", 2);
        map1.put("C", 3);

        Map<String, Integer> map2 = new HashMap<>();
        map2.put("B", 4);
        map2.put("C", 5);
        map2.put("D", 6);

        // 공통으로 들어있는 키를 찾고, 그 값의 합을 구하라
        Map<String, Integer> answer = new HashMap<>();
        for (String key : map1.keySet()) {
            if (map2.containsKey(key)) {
                int sum = map1.get(key) + map2.get(key);
                answer.put(key, sum);
            }

        }
        System.out.println(answer);

    }
}
