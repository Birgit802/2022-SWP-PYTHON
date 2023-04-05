package pizza_example;

public class RostockPizzeria  extends Pizzeria{
   public Pizza createPizza(String type){
        if (type.equals("Salami")){
            return new RostockSalami();
        } else if (type.equals("Hawai")){
            return new RostockHawai();
        } else if (type.equals("Calzone")){
            return new RostockCalzone();
        } else if (type.equals("Quattro Stagioni")){
            return new RostockQuattroStagioni();
        } else return null;

    }

    @Override
    public void prepare() {

    }


}


