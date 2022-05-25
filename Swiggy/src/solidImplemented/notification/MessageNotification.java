package solidImplemented.notification;

public class MessageNotification implements NotificationService {
    @Override
    public void Notification(String medium) {
        System.out.println("notification sent through sms");
    }
}
