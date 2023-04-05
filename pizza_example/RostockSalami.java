package pizza_example;

public class RostockSalami extends Pizza{
    public RostockSalami(){
        name=" Rostock Salami";
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
