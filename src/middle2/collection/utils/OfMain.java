package middle2.collection.utils;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class OfMain {
    public static void main(String[] args) {
        // 편리한 불변 컬렉션 생성
        List<Integer> list = List.of(1, 2, 3);
        Set<Integer> set = Set.of(1, 2, 3);
        Map<Integer, String> map = Map.of(1, "one", 2, "two");
        // list.add(4) -> 에러 발생
        System.out.println("list = " + list);
        System.out.println("set = " + set);
        System.out.println("map = " + map);

    }

}
