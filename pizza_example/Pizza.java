package pizza_example;


public abstract class Pizza {
    String name;
    public String getName(){
        return name;
    }
    abstract void prepare();
    abstract void bake();
    abstract void cut();
    abstract void wrap();


}
