package weather_example_push;

import java.util.ArrayList;
import java.util.List;

//Beispiel Zeitung --Klasse Verlag
public abstract class Observable {

    private List<Observer> observerList = new ArrayList<Observer>();
    public void register(Observer newObserver){
        observerList.add(newObserver);
    }

    protected void notifyObservers(double temp, double hum){
        for (Observer observer : observerList) {
            observer.update(temp, hum);
        }
    }
}
