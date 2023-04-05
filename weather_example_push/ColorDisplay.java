package weather_example_push;


public class ColorDisplay implements Observer {

    public ColorDisplay(Center center) {
        center.register(this);
    }

    public void update(double temperature, double humidity) {
        if (temperature >= 25 && humidity >= 60) {
            System.out.println("zu hohe Temperatur: " + temperature +"°C" );
            System.out.println("zu hohe Luftfeuchtigkeit: " + humidity +  "%");
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
