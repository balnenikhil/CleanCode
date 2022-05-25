package solidImplemented.notification;

public class EmailNotification implements NotificationService {
    @Override
    public void Notification(String medium) {
        System.out.println("notification sent through email");
    }
}
