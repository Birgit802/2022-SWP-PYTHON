package weather_example_pull;


public class Display implements Observer {

    private double temperature;
    private double humidity;
    private Center center;

    public Display(Center center){
        this.center = center;
        center.register(this);
    }

    public void update() {
        this.temperature = center.getTemp();
        this.humidity = center.getHum();
            System.out.println("Update Display Temperatur: " + temperature +"°C" );
            System.out.println("Update Display Luftfeuchtigkeit: " + humidity +  "%");
            System.out.println("*****************************************************************************************************");
    }
}
