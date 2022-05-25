package solidImplemented.support;

public class SupportManager {
    public void support(SupportBean supportBean){
        SwiggySupport swiggySupport;
        DeliverySupport deliverySupport;
        if( supportBean.getChoice() == 1)
        {
            swiggySupport = new GeneralSupport();
            swiggySupport.messageSupportTeam(supportBean.getMessage(), supportBean.getMedium());
        }
        if( supportBean.getChoice() == 2)
        {
            swiggySupport = new OrderSupport();
            swiggySupport.messageSupportTeam(supportBean.getMessage(), supportBean.getMedium());
        }
        if( supportBean.getChoice() == 4)
        {
            deliverySupport = new OrderSupport();
            deliverySupport.deliverySupport(supportBean.getMessage(), supportBean.getMedium());
        }

    }
}
