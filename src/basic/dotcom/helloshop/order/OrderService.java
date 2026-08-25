package basic.dotcom.helloshop.order;

import basic.dotcom.helloshop.product.Product;
import basic.dotcom.helloshop.user.User;

public class OrderService {
    public void order() {
        User user = new User();
        Product product = new Product();
        Order order = new Order(user, product);
    }
}
