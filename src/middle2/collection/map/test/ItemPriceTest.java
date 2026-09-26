package middle2.collection.map.test;

import java.util.*;

public class ItemPriceTest {

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("사과", 500);
        map.put("바나나", 500);
        map.put("망고", 1000);
        map.put("딸기", 1000);
        List<String> list = new LinkedList<>();
        // 값이 1000원인 모든 상품을 출력해라
        for (String s : map.keySet()) {
            if (map.get(s) == 1000) list.add(s);
        }
        System.out.println(list);
    }
}
