package weather_example_push;

//Beispiel Zeitung---- FAZ Verlag
public class Center extends Observable {

    private double temperature;
    private double humidity;

    public void setState(double temp, double hum) {
        this.temperature = temp;
        this.humidity = hum;
        notifyObservers(temp, hum);
    }
    //hole Daten
    public String getState() {
        return "temp: " + temperature + "humidity: " + humidity;
    }

}
