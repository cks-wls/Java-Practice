package middle2.collection.map.test;

import java.util.HashMap;
import java.util.Map;

public class WordFrequencyTest1 {

    public static void main(String[] args) {
        String text = "orange banana apple apple banana apple";
        //  코드 작성
        String[] arr = text.split(" ");
        Map<String, Integer> result = new HashMap<>();
        for (String val : arr) {
//            if (!result.containsKey(val)) {
//                result.put(val, 1);
//            } else {
//                result.put(val, result.get(val) + 1);
//            }
            Integer count = result.getOrDefault(val, 0);
            count++;
            result.put(val, count);
        }
        System.out.println(result);
    }
}
