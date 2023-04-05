package pizza_example;

public class PizzaOrder {
    public static void main(String[]args){
        Pizzeria hp = new HamburgPizzeria();
        Pizza p = hp.orderPizza("Quattro Stagioni");
        p.prepare();

        Pizzeria rs = new RostockPizzeria();
        Pizza p2= rs.orderPizza("Calzone");
        p2.prepare();

        Pizzeria bp = new BerlinPizzeria();
        Pizza p3 = bp.orderPizza("Hawai");
        p3.prepare();

        Pizzeria bb = new BerlinPizzeria();
        Pizza p4 = bb.orderPizza("Salami");
        p4.prepare();






    }
}
