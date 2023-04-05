package pizza_example;

public class BerlinPizzeria  extends Pizzeria{
    public Pizza createPizza(String type){
        if (type.equals("Salami")){
            return new BerlinSalami();
        } else if (type.equals("Hawai")){
            return new BerlinHawai();
        } else if (type.equals("Calzone")){
            return new BerlinCalzone();
        } else if (type.equals("Quattro Stagioni")){
            return new BerlinQuattroStagioni();
        } else return null;
    }
    public void prepare(){
        System.out.println("Ihre Bestellung wird gerade frisch zubereitet" );
    }
}
