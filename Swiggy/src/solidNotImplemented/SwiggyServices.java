package solidNotImplemented;

// class not following single responsibility principle since it is having multiple reasons to change
public class SwiggyServices {
    public void restaurants(){
        // code for all restaurants delivering through swiggy
    }

    public void sendNotification(String medium){
        //code for all types of notifications user subscribed

        if (medium.equals("email")) {
            System.out.println("notified through email");
        }
        if ( medium.equals("app")){
            System.out.println("notified through app");
        }
        if ( medium.equals("message")){
            System.out.println("notified through sms");
        }
    }

    public void payment(String paymentType){

        // code for payment option user wishes to use
        if (paymentType.equals("credit card"))
        {
            System.out.println("pay through credit card");
        }
        if (paymentType.equals("debit card"))
        {
            System.out.println("pay through debit card");
        }
        if (paymentType.equals("UPI"))
        {
            System.out.println("pay through UPI");
        }
    }
}
