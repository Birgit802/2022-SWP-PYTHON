package letter_factory;


public abstract class Letter {
    public abstract double getWeight();
    public abstract double getSize();
    abstract void checkPackage();

    /*public String toString(){
        return "Gewicht= "+this.getWeight()+", Format=" +this.getSize();
    }

     */


}