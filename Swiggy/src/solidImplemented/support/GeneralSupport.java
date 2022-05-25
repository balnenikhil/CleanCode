package solidImplemented.support;

public class GeneralSupport implements SwiggySupport {
    public void messageSupportTeam(String message, String medium) {
        System.out.println("Your Message: "+message+" "+"has been sent to general support team you will be contacted through "+ medium+" in 10 minutes");
    }
}
