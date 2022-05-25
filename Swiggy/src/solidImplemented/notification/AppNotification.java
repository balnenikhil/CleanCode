package solidImplemented.notification;

public class AppNotification  implements NotificationService {
    @Override
    public void Notification(String medium) {
        System.out.println("notification sent through app");
    }
}
