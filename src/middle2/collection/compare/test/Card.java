package middle2.collection.compare.test;

import java.util.HashMap;
import java.util.Map;

public class Card implements Comparable<Card> {
    private String shape;
    private String number;

    public String getShape() {
        return shape;
    }

    public String getNumber() {
        return number;
    }

    public Card(String shape, String number) {
        this.shape = shape;
        this.number = number;
    }

    @Override
    public int compareTo(Card o) {
        return Integer.parseInt(this.number) < Integer.parseInt(o.number) ? -1 : (Integer.parseInt(this.number) == Integer.parseInt(o.number)) ? shapeCompareTo(this.shape, o.shape) : 1;
    }

    private int shapeCompareTo(String shape1, String shape2) {
        Map<String, Integer> map = new HashMap<>();
        map.put("\u2660", 1);
        map.put("\u2665", 2);
        map.put("\u2666", 3);
        map.put("\u2663", 4);
        int result1 = 0;
        int result2 = 0;
        for (String s : map.keySet()) {
            if (s.equals(shape1)) result1 = map.get(s);
            if (s.equals(shape2)) result2 = map.get(s);
        }
        return (result1 < result2) ? -1 : (result1 == result2) ? 0 : 1;

    }
}
