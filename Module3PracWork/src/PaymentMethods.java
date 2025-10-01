class CreditCardPayment implements IPayment {
    public void processPayment(double amount) {
        System.out.println("Paid with Credit Card: " + amount);
    }
}
class PayPalPayment implements IPayment {
    public void processPayment(double amount) {
        System.out.println("Paid with PayPal: " + amount);
    }
}
class BankTransferPayment implements IPayment {
    public void processPayment(double amount) {
        System.out.println("Paid with Transfer:  " + amount);
    }
}