package src;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Order {

    //WRONG CASE
    public List<Product> productsList = new ArrayList<>();

    public void addProduct(Product product){ productsList.add(product);}
    public void removeProduct(Product product){ productsList.remove(product);}

    public BigDecimal calculateValue(){
        return productsList.stream()
                .map(Product::getValue)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }

    public List<Order> findOrders(){
       // return a list of orders in database
        return new ArrayList<>();
    }

    public void saveOrder(){
        //save order
    }

    public void sendEmail(String email){
        //send email to order
    }

    /* A class should have one, and only one, reason to change
    ***SINGLE RESPONSIBILITY PRINCIPLE***
    Different that case, in this class Order.
    The solution is there on package SRP --> Single Responsibility Principle
     */
}
