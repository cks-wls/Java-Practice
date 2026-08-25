package basic.access.ex;

public class ShoppingCart {
    // 상품을 최대 10개만 담을 수 있음
    // 10개 초과시 : "장바구니가 가득 찼습니다" 출력
    private Item[] items = new Item[10];
    private int itemCount;

    public void addItem(Item item) {
        if (isMaxItems()) {
            System.out.println("장바구니가 가득 찼습니다.");
        } else {
            items[itemCount] = item;
            itemCount++;
        }
    }

    public void displayItems() {
        System.out.println("장바구니 상품 출력");
        int totalPrice = 0;
        for (int i = 0; i < itemCount; i++) {
            String name = items[i].getName();
            int price = items[i].getTotalPrice();
            totalPrice += price;
            System.out.println("상품명 : " + name + " 합계 : " + price);
        }
        System.out.println("전체 가격 합 : " + totalPrice);
    }

    private boolean isMaxItems() {
        return itemCount > items.length;
    }
}
