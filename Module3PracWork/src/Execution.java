public class Execution {
    public static void main(String[] args) {
        Order order1 = new Order();
        Order order2 = new Order();
        Order order3 = new Order();

        order1.addItem("Abobus", 1337);
        order1.addItem("Amogus", 6750);
        order2.addItem("Gork", 2222);
        order2.addItem("Mork", 4444);
        order3.addItem("Expensive item", 80000);
        order3.addItem("Dirty Deed Done Dirt Cheap", 4);

        order1.setPayment(new CreditCardPayment());
        order1.setDelivery(new CourierDelivery());
        order1.setNotification(new EmailNotification());
        order1.getDiscountCalculator().addDiscount(new SeasonalDiscount());
        order1.getDiscountCalculator().addDiscount(new LoyaltyDiscount());

        order2.setPayment(new PayPalPayment());
        order2.setDelivery(new PostDelivery());
        order2.setNotification(new SmsNotification());
        order2.getDiscountCalculator().addDiscount(new LoyaltyDiscount());

        order3.setPayment(new BankTransferPayment());
        order3.setDelivery(new PickUpPointDelivery());
        order3.setNotification(new TellYouOnEarNotification());
        order3.getDiscountCalculator().addDiscount(new SeasonalDiscount());

        order1.processOrder();
        order2.processOrder();
        order3.processOrder();
    }
}