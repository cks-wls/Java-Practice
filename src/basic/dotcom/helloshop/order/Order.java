package basic.dotcom.helloshop.order;

import basic.dotcom.helloshop.product.Product;
import basic.dotcom.helloshop.user.User;

public class Order {
    User user;
    Product product;

    public Order(User user, Product product) {
        this.user = user;
        this.product = product;
    }
}
