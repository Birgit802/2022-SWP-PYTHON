package pizza_example;

public class HamburgCalzone extends Pizza{
    public HamburgCalzone(){
        name=" Hamburger Calzone";
    }
    @Override
    void wrap(){
        System.out.println("Ihre Pizza wird im HSV Karton verpackt");
    }
    @Override
    void cut() {
        System.out.println(" Calzone wird nicht geschnitten");
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
