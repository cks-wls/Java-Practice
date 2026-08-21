package Class.Ex;

public class Ex2 {
    public static void main(String[] args) {
        ProductOrder product1 = new ProductOrder();
        product1.productName = "맥북";
        product1.price = 1000000;
        product1.quantity = 3;
        ProductOrder product2 = new ProductOrder();
        product2.productName = "그램";
        product2.price = 900000;
        product2.quantity = 5;
        ProductOrder[] products = {product1, product2};
        int total = 0;
        for (ProductOrder product : products) {
            System.out.println("상품명 : " + product.productName + ", 가격 : " + product.price + ", 수량 : " + product.quantity);
            total += product.price * product.quantity;
        }
        System.out.println("총 결제 금액 : " + total);


    }
}
