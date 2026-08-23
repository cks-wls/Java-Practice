package ref.ex;

public class Ex1 {
    public static void main(String[] args) {
        ProductOrder product1 = initProductOrder("맥북", 1000000, 3);
        ProductOrder product2 = initProductOrder("그램", 900000, 5);
        ProductOrder[] products = {product1, product2};
        printProduct(products);
    }


    static ProductOrder initProductOrder(String productName, int price, int quantity) {
        ProductOrder product = new ProductOrder();
        product.productName = productName;
        product.price = price;
        product.quantity = quantity;
        return product;

    }

    static void printProduct(ProductOrder[] products) {
        int total = 0;
        for (ProductOrder product : products) {
            System.out.println("상품명 : " + product.productName + ", 가격 : " + product.price + ", 수량 : " + product.quantity);
            total += product.price * product.quantity;
        }
        System.out.println("총 결제 금액 : " + total);
    }
}
