package solidImplemented.payment;

public class PaymentManager {

    public void payment(String paymentType, Integer price, String cardNumber){
        PaymentService paymentService = new PaymentService();
        if(paymentType.equals("credit"))
        {
            paymentService.CreditCardDetails(price, cardNumber);
        }
        if(paymentType.equals("debit"))
        {
            paymentService.DebitCardDetails(price, cardNumber);
        }
        if( paymentType.equals("upi"))
        {
            paymentService.UPIDetails(price, cardNumber);
        }
    }
}
