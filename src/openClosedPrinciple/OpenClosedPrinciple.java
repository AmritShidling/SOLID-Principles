package openClosedPrinciple;

/* Open-Closed Principle suggests that Software entity (like class, module, method, etc) should be open for extension
and closed for modification.

It suggests that we should be able to extend the class behaviour without modifying its source code.
 */

class CustomerBad{
    String type;
    public CustomerBad(String  type){
        this.type = type;
    }
    public String getType(){
        return this.type;
    }
}

class DiscountCalculatorBad{
    public double calculateDiscount(CustomerBad customerBad, double amount){
        if(customerBad.getType().equalsIgnoreCase("Regular")){
            return amount * 0.1;
        }
        else if(customerBad.getType().equalsIgnoreCase("Premium")){
            return amount * 0.2;
        }
        else if(customerBad.getType().equalsIgnoreCase("VIP")){
            return amount * 0.3;
        }
        return 0.0;
    }
}

//Problem with above code is, If we have to add new customer type we have to modify DiscountCalculatorBad class

interface DiscountStrategy{
    public double getDiscount(int amount);
}

class RegularCustomerDiscount implements DiscountStrategy{
    public double getDiscount(int amount){
        return 0.1 * amount;
    }
}
class PremiumCustomerDiscount implements  DiscountStrategy{
    public double getDiscount(int amount){
        return 0.2 * amount;
    }
}
class VIPCustomerDiscount implements  DiscountStrategy{
    public double getDiscount(int amount){
        return 0.3 * amount;
    }
}

class NewCustomerDiscount implements DiscountStrategy{
    public double getDiscount(int amount){
        return 0.35 * amount;
    }
}
class Customer{
    DiscountStrategy discountStrategy;
    public Customer(DiscountStrategy discountStrategy){
        this.discountStrategy = discountStrategy;
    }
    public double applyDiscount(int amount){
        return this.discountStrategy.getDiscount(amount);
    }
}


class Vehicle{
    int wheel;
    public Vehicle(int wheel){
        this.wheel = wheel;
    }


}
public class OpenClosedPrinciple {

    public static void main(String[] args) {
        Customer regular = new Customer(new RegularCustomerDiscount());
        System.out.println(regular.applyDiscount(1000));
        Customer vip = new Customer(new VIPCustomerDiscount());
        System.out.println(vip.applyDiscount(1000));

        Customer customerWithNewDiscount = new Customer(new NewCustomerDiscount());

        System.out.println(customerWithNewDiscount.applyDiscount(1000));
    }
}
