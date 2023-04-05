package letter_factory;

public class A6_Letter extends Letter {
    private double weight;
    private double size;

    public A6_Letter(double weight, double size){
        this.size= size;
        this.weight= weight;
    }


    @Override
    public double getWeight() {
        return this.weight;
    }
    public void checkPackage() {
        if (this.weight > 16 && this.size > 16) {
            System.out.println("Das ist ein Paket.");
        } else {
            System.out.println("Das ist A6-Format.");
        }
    }

    @Override
    public double getSize() {
        return this.size;
    }

}
