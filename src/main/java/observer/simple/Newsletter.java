package observer.simple;

import java.util.ArrayList;
import java.util.List;

public class Newsletter implements Observable {
    private final List<Observer> observers;
    private final String newsletterName;

    public Newsletter(String newsletterName) {
        this.newsletterName = newsletterName;
        this.observers = new ArrayList<>();
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void sendMessage(String message) {
        for (Observer observer : observers) {
            observer.update(newsletterName + ": " + message);
        }
    }
}
