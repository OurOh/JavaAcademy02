package Z_com.helloshop.order;


import Z_com.helloshop.product.Product;
import Z_com.helloshop.user.User;

public class OrderService {
    public void order(){
        User user = new User();
        Product product = new Product();
        Order order = new Order(user, product);
    }
}
