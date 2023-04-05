package pizza_example;

public class RostockQuattroStagioni extends Pizza {
    public RostockQuattroStagioni(){
        name=" Rostock QS";
    }
    @Override
    void wrap(){
        System.out.println("Ihre Pizza wird im Hansa Rostock Karton verpackt");
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


