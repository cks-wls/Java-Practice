package middle2.collection.list.test.ex2;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Item> list = new ArrayList<>();
    private int totalPrice;

    public void addItem(Item item) {
        list.add(item);
    }

    public void displayItems() {
        System.out.println("장바구니 상품 출력");
        for (Item item : list) {
            System.out.println("상품명 : " + item.getName() + ", 합계 : " + item.getTotalPrice());
        }
        for (Item item : list) {
            totalPrice += item.getTotalPrice();
        }
        System.out.println("전체 가격 합 : " + totalPrice);

    }
}
