class EmailNotification implements INotification {
    public void sendNotification(String message) {
        System.out.println("Delivered through E-Mail. Content: " + message);
    }
}
class SmsNotification implements INotification {
    public void sendNotification(String message) {
        System.out.println("Delivered through SMS. Content: " + message);
    }
}
class TellYouOnEarNotification implements INotification {
    public void sendNotification(String message) {
        System.out.println("I will tell you personally this: " + message);
    }
}