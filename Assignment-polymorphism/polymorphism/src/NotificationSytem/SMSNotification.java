package NotificationSytem;

class SMSNotification extends Notification {
    void send() {
        System.out.println("Sending SMS Notification");
    }

    public static void main(String[] args) {
        Notification n1 = new EmailNotification();
        Notification n2 = new SMSNotification();

        n1.send();
        n2.send();
    }
}