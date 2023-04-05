package pizza_example;

public class HamburgSalami extends Pizza{
    public HamburgSalami(){
        name="Hamburg Salami";
    }
    @Override
    void wrap(){
        System.out.println("Ihre Pizza wird im HSV Karton verpackt");
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

