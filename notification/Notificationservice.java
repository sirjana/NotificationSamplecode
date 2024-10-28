package notification;

public class Notificationservice {
 
    private final Inotification notification;

    // Dependency Injection via Constructor
    public Notificationservice(Inotification notification) {
        this.notification = notification;
    }

    public void notifyUser(String message) {
        notification.sendNotification(message);
    }
}
