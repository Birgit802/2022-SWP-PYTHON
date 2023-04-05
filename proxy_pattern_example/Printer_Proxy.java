package proxy_pattern_example;
//in der proxy klasse kommt die switchto
public class Printer_Proxy implements Printer {
    private Printer printer;

    public Printer_Proxy(Printer printer) {
        this.printer = printer;
    }
    public void switchTo(Printer printer) {
        this.printer = printer;
    }
    public void print() {
        printer.print();
    }
}