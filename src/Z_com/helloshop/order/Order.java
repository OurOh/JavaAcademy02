package Z_com.helloshop.order;


import Z_com.helloshop.product.Product;
import Z_com.helloshop.user.User;


public class Order {
    User user;
    Product product;

    public Order(User user, Product product){
        this.user = user;
        this.product = product;
    }

}
