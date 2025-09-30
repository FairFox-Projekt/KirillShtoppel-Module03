//Произведите корректную (правильную) по вашему мнению реализацию с применением принципа Dependency-Inversion Principle, DIP:
interface INotificationSender {
    void send(String message);
}
class EmailSender implements INotificationSender {
    public void send(String message) {
        System.out.println("Email sent: " + message);
    }
}
class SmsSender implements INotificationSender {
    public void send(String message) {
        System.out.println("SMS sent: " + message);
    }
}
class NotificationServiceSecond { //Оно поконфликтовало с классом из SRP, ужс
    private INotificationSender sender;
    public NotificationServiceSecond(INotificationSender sender) {
        this.sender = sender;
    }
    public void sendNotification(String message) {
        sender.send(message);
    }
}
