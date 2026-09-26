package middle2.collection.map.test.cart;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Cart {
    Map<Product, Integer> cartMap = new HashMap<>();

    public void add(Product product, int amount) {
        // 이미 존재한다면 수량만 추가
        if (!cartMap.containsKey(product)) {
            cartMap.put(product, amount);
        } else {
            for (Product product1 : cartMap.keySet()) {
                if (product1.equals(product)) {
                    cartMap.put(product1, cartMap.get(product1) + amount);
                }
            }
        }


    }

    public void printAll() {
        System.out.println("== 모든 상품 출력 == ");
        for (Product product : cartMap.keySet()) {
            System.out.println("상품 : " + product + " 수량 : " + cartMap.get(product));
        }
    }

    public void minus(Product product, int amount) {
        // 남은 수량이 0이하면 장바구니에서 제거
        if (cartMap.get(product) - amount <= 0) {
            cartMap.remove(product);
        } else {
            cartMap.put(product, cartMap.get(product) - amount);
        }
    }


}
