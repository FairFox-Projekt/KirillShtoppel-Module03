//я потерял что мы там делали на третьей неделе
import java.util.*;
interface IPayment {
    void processPayment(double amount);
}
interface IDelivery {
    void deliverOrder(Order order);
}
interface INotification {
    void sendNotification(String message);
}
interface IDiscount {
    double applyDiscount(double amount);
}

class Order {
    private List<String> items = new ArrayList<>();
    private List<Double> prices = new ArrayList<>();
    private IPayment payment;
    private IDelivery delivery;
    private INotification notification;
    private DiscountCalculator discountCalculator = new DiscountCalculator();
    public void addItem(String item, double price) {
        items.add(item);
        prices.add(price);
    }
    public List<String> getItems() {
        return items;
    }
    public void setPayment(IPayment payment) {
        this.payment = payment;
    }
    public void setDelivery(IDelivery delivery) {
        this.delivery = delivery;
    }
    public void setNotification(INotification notification) {
        this.notification = notification;
    }
    public DiscountCalculator getDiscountCalculator() {
        return discountCalculator;
    }
    public double calculateTotal() {
        double total = 0;
        for (double price : prices) {
            total += price;
        }
        return discountCalculator.applyDiscounts(total);
    }
    public void processOrder() {
        double total = calculateTotal();
        payment.processPayment(total);
        delivery.deliverOrder(this);
        notification.sendNotification("Your order have been processed. There's a price: " + total);
    }
}