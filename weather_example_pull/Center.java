package weather_example_pull;

//Beispiel Zeitung---- FAZ Verlag
public class Center extends Observable {

    private double temperature;
    private double humidity;

    public void setState(double temp, double hum) {
        this.temperature = temp;
        this.humidity = hum;
        notifyObservers();
    }

    public double getTemp() {
        return temperature;
    }
    public double getHum() {
        return humidity;
    }
}
