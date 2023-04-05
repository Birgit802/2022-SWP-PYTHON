package pizza_example;

public abstract class Pizzeria {
    //abstrakte Methode für die speziellen pizzas
    //vgl Softwareshop von beispiel Folie philip hauer
    abstract Pizza createPizza(String type);
    public abstract void prepare();
    //bestellen in der Main
    public Pizza orderPizza(String type){
        Pizza pizza = createPizza(type);
        System.out.println("Ihre Bestellung "  + pizza.getName() + " ist in unser System eingegangen ");
        pizza.bake();
        pizza.cut();
        pizza.wrap();
        return pizza;


    }


}
