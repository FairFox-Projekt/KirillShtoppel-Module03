//Произведите корректную (правильную) по вашему мнению реализацию с применением принципа Single-Responsibility Principle (SRP):
class Order {
    private String productName;
    private int quantity;
    private double price;
    public Order(String productName, int quantity, double price) {
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
    }
    //я испытываю зависть к простым геттерам-сеттерам в си шарпе
    public String getProductName() {
        return productName;
    }
    public int getQuantity() {
        return quantity;
    }
    public double getPrice() {
        return price;
    }
}
class PriceCalculator {
    public double calculateTotalPrice(Order order) {
        return order.getQuantity()*order.getPrice()*0.9;
    }
}
class PaymentProcessor {
    public void processPayment(String paymentDetails) {
        System.out.println("Payment processed using: "+paymentDetails);
    }
}
class NotificationService {
    public void sendConfirmationEmail(String email) {
        System.out.println("Confirmation email sent to: " + email);
    }
}
