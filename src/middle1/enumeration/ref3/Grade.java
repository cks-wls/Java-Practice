package middle1.enumeration.ref3;

public enum Grade {
    BASIC(10), GOLD(20), DIAMOND(30);

    private final int discountPercent;

    Grade(int discountPercent) {
        this.discountPercent = discountPercent;
    }

    //추가
    public int discount(int price){
        return price * discountPercent / 100;
    }
}
