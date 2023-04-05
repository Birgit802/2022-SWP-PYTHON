package pizza_example;

public class BerlinHawai extends Pizza {
    public BerlinHawai(){
        name=" Berlin Hawaii";
    }
    @Override
    void prepare() {
        System.out.println("Vielen Dank für Ihre Bestellung !" );
    }

    @Override
    void bake() {
        System.out.println("Ihre Pizza wird gebacken");
    }
    @Override
    void cut() {
        System.out.println("Ihre Pizza wird geschnitten");
    }
    @Override
    void wrap(){
        System.out.println("Ihre Pizza wird im Union Berlin Karton verpackt");
    }

}
