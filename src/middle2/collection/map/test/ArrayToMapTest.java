package middle2.collection.map.test;

import java.util.HashMap;
import java.util.Map;

public class ArrayToMapTest {
    public static void main(String[] args) {
        String[][] productArr = {{"Java", "10000"}, {"Spring", "20000"}, {"JPA", "30000"}};
        Map<String, Integer> map = new HashMap<>();
        // 주어진 배열로 부터 Map 생성
        for (String[] val : productArr) {
            map.put(val[0], Integer.parseInt(val[1]));
        }
        // Map의 모든 데이터 출력
        for (String key : map.keySet()) {
            System.out.println("제품 : " + key + ", 가격 : " + map.get(key));
        }
    }
}
