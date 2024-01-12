package src.ocp.problem;

public class DiscountController {

    //OPC --> OPEN CLOSED PRINCIPLE
    //YOU SHOULD BE ABLE TO EXTEND A CLASSES BEHAVIOR, WITHOUT MODIFYING IT.
    public void addDiscountChild(DiscountChild discountChild){
        discountChild.valueDiscount();
    }

    public void addDiscountElderly(DiscountElderly discountElderly){
        discountElderly.valueDiscount();
    }

    //In this case, always add one method to put a discount;

}
