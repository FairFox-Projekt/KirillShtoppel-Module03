//Произведите корректную (правильную) по вашему мнению реализацию с применением принципа Open-Closed Principle, OCP:
//без знания принципов идеалом было бы заменить иф-элс на свитч-кейс, но боюсь такой юмор не оценят
abstract class Employee {
    private String name;
    private double baseSalary;
    public Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }
    public String getName() {
        return name;
    }
    public double getBaseSalary() {
        return baseSalary;
    }
    public abstract double calculateSalary();
}
class PermanentEmployee extends Employee {
    public PermanentEmployee(String name, double baseSalary) {
        super(name, baseSalary);
    }
    public double calculateSalary() {
        return getBaseSalary() * 1.2;
    }
}
class ContractEmployee extends Employee {
    public ContractEmployee(String name, double baseSalary) {
        super(name, baseSalary);
    }
    public double calculateSalary() {
        return getBaseSalary() * 1.1;
    }
}
class InternEmployee extends Employee {
    public InternEmployee(String name, double baseSalary) {
        super(name, baseSalary);
    }
    public double calculateSalary() {
        return getBaseSalary() * 0.8;
    }
}
//никаких больше ужасов с иф-элсом
