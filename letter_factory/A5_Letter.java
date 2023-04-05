package letter_factory;

public class A5_Letter extends Letter {
    private double weight;
    private double size;

    public A5_Letter(double weight, double size){
        this.size= size;
        this.weight= weight;
    }


    @Override
    public double getWeight() {
        return this.weight;
    }
    public void checkPackage() {
        if (this.weight > 15 && this.size > 15) {
            System.out.println("Das ist ein Paket.");
        } else {
            System.out.println("Das ist A5-Format.");
        }
    }

    @Override
    public double getSize() {
        return this.size;
    }


}


