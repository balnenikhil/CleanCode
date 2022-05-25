package solidImplemented.payment;

public class PaymentService implements CreditCard, DebitCard, UPI {
    @Override
    public void CreditCardDetails(Integer price, String cardNumber) {
        System.out.println("your payment of Rs."+price+" with credit card Number: "+cardNumber+" is successful");
        System.out.println("Order Successful...!!!");
        System.out.println("your details have been sent to the delivery guy, he will contact you.");
        System.out.println("Thanks for ordering on swiggy ... :)");
    }

    @Override
    public void DebitCardDetails(Integer price, String cardNumber) {
        System.out.println("your payment of Rs."+price+" with debit card Number: "+cardNumber+" is successful");
        System.out.println("Order Successful...!!!");
        System.out.println("your details have been sent to the delivery guy, he will contact you.");
        System.out.println("Thanks for ordering on swiggy ... :)");
    }

    @Override
    public void UPIDetails(Integer price, String upiId) {
        System.out.println("your payment of Rs."+price+" with UPI Id: "+upiId+" is successful");
        System.out.println("Order Successful...!!!");
        System.out.println("your details have been sent to the delivery guy, he will contact you.");
        System.out.println("Thanks for ordering on swiggy ... :)");
    }

    //code to list all payments available on swiggy
}
