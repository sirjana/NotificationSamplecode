 package notification;
 import notification.*;

public class Main {
public static void main(String[] args) {

    Inotification smsNotification = new Smsnotification();
    Notificationservice smsService = new Notificationservice(smsNotification);
    Notificationservice sms = new Notificationservice(new Smsnotification());
    smsService.notifyUser("Your package has been shipped!");
    sms.notifyUser("notify user using sms object directly.");
}
}