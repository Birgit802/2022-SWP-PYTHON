package pizza_example;

public class BerlinQuattroStagioni extends Pizza{
    public BerlinQuattroStagioni(){
        name="Berliner Vierjahreszeiten";
    }

    @Override
    void wrap() {
        System.out.println("Ihre Pizza wird im Union Berlin Karton verpackt");
    }
    @Override
    void prepare(){
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
}
