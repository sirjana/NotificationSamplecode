package notification;
public class Smsnotification implements Inotification {

    @Override
    public void sendNotification(String message) {
        System.out.println("Sending SMS notification" +message);
    }
    
}
