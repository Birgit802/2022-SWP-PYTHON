package weather_example_push;

public class Display implements Observer {

    public Display(Center center){
        center.register(this);
    }
    public void update(double temp, double hum) {
        System.out.println("Update Display Temperatur: " + temp +"°C" );
        System.out.println("Update Display Luftfeuchtigkeit: " + hum +  "%");
        System.out.println("*****************************************************************************************************");
    }
}
