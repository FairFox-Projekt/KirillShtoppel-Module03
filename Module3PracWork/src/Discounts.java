import java.util.*;
class SeasonalDiscount implements IDiscount {
    public double applyDiscount(double amount) {
        return amount * 0.9;
    }
}
class LoyaltyDiscount implements IDiscount {
    public double applyDiscount(double amount) {
        return amount * 0.95;
    }
}
class DiscountCalculator {
    private List<IDiscount> discounts = new ArrayList<>();
    public void addDiscount(IDiscount discount) {
        discounts.add(discount);
    }
    public double applyDiscounts(double amount) {
        double result = amount;
        for (IDiscount d : discounts) {
            result = d.applyDiscount(result);
        }
        return result;
    }
}