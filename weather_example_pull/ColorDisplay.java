package weather_example_pull;


public class ColorDisplay implements Observer {

    private double temperature;
    private double humidity;
    private Center center;

    public ColorDisplay(Center center){
        this.center = center;
        center.register(this);
    }
    public void update() {
        this.temperature = center.getTemp();
        this.humidity = center.getHum();
        if (temperature >= 25 && humidity >= 60) {
            System.out.println("Kritische Temperatur: " + temperature +"°C" );
            System.out.println("Kritische Luftfeuchtigkeit: " + humidity +  "%");
            System.out.println("RED");
            System.out.println("Alarm auslösen");
        } else if (temperature >= 20 && humidity >= 50) {
            System.out.println("Kritische Temperatur: " + temperature +"°C" );
            System.out.println("Kritische Luftfeuchtigkeit: " + humidity +  "%");
            System.out.println("YELLOW");
            System.out.println("Kontrolle einleiten");
        } else {
            System.out.println("GREEN");
            System.out.println("System funktioniert");
        }
        System.out.println("***********************************************************************************");
    }



}

