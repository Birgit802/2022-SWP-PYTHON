package letter_factory;


public class Letter_Factory {
    public static Letter getLetter(String type, double weight, double size) {
        {
            if (type.equals("A4")) {
                return new A4_Letter(weight, size);
            } else if (type.equals("A5")) {
                return new A5_Letter(weight, size);
            } else if (type.equals("A6")) {
                return new A6_Letter(weight, size);
            } else return null;
        }
    }
}




