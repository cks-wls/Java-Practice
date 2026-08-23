package ref.ex;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("입력할 주문의 개수를 입력하세요 : ");
        int totalCount = scanner.nextInt();
        ProductOrder[] products = new ProductOrder[totalCount];
        int count = 0;
        while (count < totalCount) {
            System.out.println((count + 1) + "번째 주문 정보를 입력하세요");
            scanner.nextLine();
            System.out.print("상품명 : ");
            String name = scanner.nextLine();
            System.out.print("가격 : ");
            int price = scanner.nextInt();
            System.out.print("수량 : ");
            int quantity = scanner.nextInt();
            ProductOrder product$count = initProductOrder(name, price, quantity);
            products[count] = product$count;
            count++;

        }
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
