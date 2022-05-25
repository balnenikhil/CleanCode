package solidNotImplemented;

public class GeneralSupport implements SwiggySupport{
    @Override
    public void deliverySupport() {
        System.out.println(" delivery boy number not available before order");
    }

    @Override
    public void messageSupport(String message) {
        System.out.println("Your Message: "+message+" "+"has been sent to support team");
    }

    @Override
    public void emailSupport(String message) {
        System.out.println("Your email: ("+message+")"+" "+"has been sent to support team");
    }
}
