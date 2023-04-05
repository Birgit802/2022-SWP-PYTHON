package pizza_example;

public class HamburgPizzeria extends Pizzeria{
    public Pizza createPizza(String type){
        if (type.equals("Salami")){
            return new HamburgSalami();
        } else if (type.equals("Hawai")){
            return new HamburgHawai();
        } else if (type.equals("Calzone")){
            return new HamburgCalzone();
        } else if (type.equals("Quattro Stagioni")){
            return new HamburgQuattroStagioni();
        } else return null;
    }
    public void prepare(){
        System.out.println("Vielen Dank für Ihre Bestellung !" );
    }
}
