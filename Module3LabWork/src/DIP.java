//Произведите корректную (правильную) по вашему мнению реализацию с применением принципа Dependency-Inversion Principle, DIP:
class Notification {
    private INotificationService notificationService;
    public Notification(INotificationService notificationService) {
        this.notificationService = notificationService;
    }
    public void send(String message) {
        notificationService.send(message);
    }
}

interface INotificationService {
    void send(String message);
}
class EmailService implements INotificationService {
    public void send(String message) {
        System.out.println("Отправка Email: " + message);
    }
}
