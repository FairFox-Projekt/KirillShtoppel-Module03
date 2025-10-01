//Произведите корректную (правильную) по вашему мнению реализацию с применением принципа Single-Responsibility Principle (SRP):
import java.util.*;
class Invoice {
    private int id;
    private List<Double> items;
    private double taxRate;
    public Invoice(int id, List<Double> items, double taxRate) {
        this.id = id;
        this.items = items;
        this.taxRate = taxRate;
    }
    public int getId() {
        return id;
    }
    public List<Double> getItems() {
        return items;
    }
    public double getTaxRate() {
        return taxRate;
    }
}
class InvoiceCalculator {
    public double calculateTotal(Invoice invoice) {
        double subTotal = 0;
        for (double price : invoice.getItems()) {
            subTotal += price;
        }
        return subTotal + subTotal * invoice.getTaxRate();
    }
}

class InvoiceRepository {
    public void save(Invoice invoice) {
        // сохранение в базу
    }
}
