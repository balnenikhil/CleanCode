package solidImplemented.support;

public class OrderSupport implements SwiggySupport, DeliverySupport {
    @Override
    public void deliverySupport(String message, String orderId) {
        String number = String.valueOf(1234567890);
        System.out.println("Here are the details of delivery guy linked to orderId : "+orderId);
        System.out.println("delivery guy number is : "+number);
        System.out.println("You can contact him for smooth delivery process");
        System.out.println("Your Message: "+message+" has been sent to the delivery guy");
    }

    @Override
    public void messageSupportTeam(String message, String medium) {
        System.out.println("Your Message: "+message+" "+"has been sent to order support team, you will be contacted through "+medium+" in 5 minutes ");
    }
}