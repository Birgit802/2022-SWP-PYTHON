package pizza_example;

public class BerlinCalzone extends Pizza{
    public BerlinCalzone(){
        name=" Berlin Calzone";
    }
    @Override
    void wrap(){
        System.out.println("Ihre Pizza wird im Union Berlin Karton verpackt");
    }
    @Override
    void cut() {
        System.out.println("Pizza Calzone wird nicht geschnitten");
    }
    @Override
    void prepare(){
        System.out.println("Vielen Dank für Ihre Bestellung !" );
    }
    @Override
    void bake() {
        System.out.println("Ihre Pizza wird gebacken");
    }
}
