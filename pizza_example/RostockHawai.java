package pizza_example;

public class RostockHawai extends Pizza{
    public RostockHawai(){
        name=" Rostock Hawai";
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

