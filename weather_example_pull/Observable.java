package weather_example_pull;
import java.util.ArrayList;
import java.util.List;

public abstract class Observable {

    private List<Observer> observerList = new ArrayList<Observer>();

    public void register(Observer newObserver){
        observerList.add(newObserver);
    }

    protected void notifyObservers(){
        for (Observer observer : observerList) {
            observer.update();
        }
    }
}

