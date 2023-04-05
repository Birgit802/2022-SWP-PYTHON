package proxy_pattern_example;

public class Client {
    public static void main(String[] args) {
        Printer bw = new BW_Printer();
        Printer cp = new Color_Printer();
        Printer_Proxy p = new Printer_Proxy(bw);


        p.switchTo(bw);
        p.print();
        System.out.println("++++++++++++++");
        p.switchTo(cp);
        p.print();
        System.out.println("++++++++++++++");
        p.switchTo(cp);
        p.print();
        System.out.println("++++++++++++++");
        p.switchTo(bw);
        p.print();


    }
}

