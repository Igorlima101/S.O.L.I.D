package src.srp;

import src.Order;
import src.Product;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class OrderOnSrp {

    //SRP = SINGLE RESPONSIBILITY PRINCIPLE

    //Separate each responsibility to your class

    //CLASS ORDER CORRECTLY //
    public List<Product> productsList = new ArrayList<>();

    public void addProduct(Product product){ productsList.add(product);}
    public void removeProduct(Product product){ productsList.remove(product);}

    public BigDecimal calculateValue(){
        return productsList.stream()
                .map(Product::getValue)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }

}
class OrderRepository {
    //ORDER REPOSITORY
    /*
    CLASS REPOSITORY. MANAGEMENT ALL CALLS TO DATABASE
     */
    public List<Order> findOrders() {
        // return a list of orders in database
        return new ArrayList<>();
    }

    public void saveOrder() {
        //save order
    }
}



class SendEmail{

    /*
    One class to management,  connections about to send emails etc...
     */
    public void sendEmail(String email){
        //send email to order
    }
}
