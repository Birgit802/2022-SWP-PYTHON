package letter_factory;


public class Letter_Client {
    public static void main(String[] args) {
        Letter a = Letter_Factory.getLetter("A4", 11,20);
        a.checkPackage();
        Letter b = Letter_Factory.getLetter("A6", 20,25);
        b.checkPackage();
        Letter c = Letter_Factory.getLetter("A5", 20,15);
        c.checkPackage();
        Letter d= Letter_Factory.getLetter("A4",25,20);
        d.checkPackage();
        Letter e= Letter_Factory.getLetter("A4",40,5);
        e.checkPackage();

    }
}
