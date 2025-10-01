//Произведите корректную (правильную) по вашему мнению реализацию с применением принципа Open-Closed Principle, OCP:
interface IDiscountPolicy {
    double applyDiscount(double amount);
}
class DiscountCalculator {
    private IDiscountPolicy policy;
    public DiscountCalculator(IDiscountPolicy policy) {
        this.policy = policy;
    }
    public double calculate(double amount) {
        return policy.applyDiscount(amount);
    }
}
class RegularIDiscount implements IDiscountPolicy {
    public double applyDiscount(double amount) {
        return amount;
    }
}
class SilverIDiscount implements IDiscountPolicy {
    public double applyDiscount(double amount) {
        return amount * 0.9;
    }
}
class GoldIDiscount implements IDiscountPolicy {
    public double applyDiscount(double amount) {
        return amount * 0.8;
    }
}
