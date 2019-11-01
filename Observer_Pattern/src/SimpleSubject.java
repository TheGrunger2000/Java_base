import java.util.*;

public class SimpleSubject implements Subject {
    private ArrayList<Observer> observers;
    private int value = 0;

    SimpleSubject() {
        observers = new ArrayList<>();
    }

    public void registerObserver(Observer o) {
        observers.add(o);
    }

    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        if (i >= 0) {
            observers.remove(i);
        }
    }

    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(value);
        }
    }

    void setValue(int value) {
        this.value = value;
        notifyObservers();
    }
}