package letter_factory;

public class A4_Letter extends Letter {
    private double weight;
    private double size;

    public A4_Letter(double weight, double size){
        this.size= size;
        this.weight= weight;
    }
    
    @Override
    public double getWeight() {
        return this.weight;

    }
    @Override
    public double getSize() {
        return this.size;
    }


        public void checkPackage() {
            if (this.weight >=12 && this.size >=12) {
                System.out.println("Das ist ein Paket.");
            } else {
                System.out.println("Das ist A4-Format.");
            }
        }




}
