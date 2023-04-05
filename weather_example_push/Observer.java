package weather_example_push;
//da drin passiert die push magic
//Im Push-Modell übergibt das Subject der update()-Methode detaillierte Informationen über die Änderung als Parameter
public interface Observer {
    public void update(double temp, double hum);
}
