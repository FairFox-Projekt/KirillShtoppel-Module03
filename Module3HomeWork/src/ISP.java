//Произведите корректную (правильную) по вашему мнению реализацию с применением принципа Interface Segregation Principle, ISP:
interface IPrinter {
    void print(String content);
}
interface IScanner {
    void scan(String content);
}
interface IFax {
    void fax(String content);
}

class OnePrinterToRuleThemAll implements IPrinter, IScanner, IFax {
    public void print(String content) {
        System.out.println("Printing: " + content);
    }
    public void scan(String content) {
        System.out.println("Scanning: " + content);
    }
    public void fax(String content) {
        System.out.println("Faxing: " + content);
    }
}
class PrinterScanner implements IPrinter, IScanner {
    public void print(String content) {
        System.out.println("Printing: " + content);
    }
    public void scan(String content) {
        System.out.println("Scanning: " + content);
    }
}
class PrinterFax implements IPrinter, IFax {
    public void print(String content) {
        System.out.println("Printing: " + content);
    }
    public void fax(String content) {
        System.out.println("Faxing: " + content);
    }
}
class BasicPrinter implements IPrinter {
    public void print(String content) {
        System.out.println("Printing: " + content);
    }
}