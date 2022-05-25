package solidNotImplemented;

public class SwiggyMain {

    public static void main(String[] args) {

        GeneralSupport generalSupport = new GeneralSupport();
        generalSupport.emailSupport("my order has been delayed");

        //instead of general support we can use swiggy support object to achieve loose coupling
         /*SwiggySupport swiggySupport = new Order();
        swiggySupport.emailSupport("my order is delayed");*/

        /*OrderSupport orderSupport = new OrderSupport();
        orderSupport.deliverySupport();*/
    }
}
