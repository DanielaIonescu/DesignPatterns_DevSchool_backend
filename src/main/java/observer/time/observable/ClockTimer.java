package observer.time.observable;

import lombok.Setter;
import observer.time.observer.Observer;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import static java.time.LocalTime.now;
import static java.time.format.DateTimeFormatter.ofPattern;

public class ClockTimer implements Observable {
    private final DateTimeFormatter formatter = ofPattern("HH:mm:ss.SSS");

    @Setter
    private LocalTime time;
    private final List<Observer> observers;

    public ClockTimer() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
        System.out.println(observer.getClass().getSimpleName() + " added to observers list.");
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
        System.out.println(observer.getClass().getSimpleName() + " removed from observers list.");
    }

    @Override
    public void tick() {
        System.out.println("Tick!");
        time = now();
        notify(time.format(formatter));
    }

    private void notify(String time) {
        for (Observer observer : observers) {
            observer.update(time);
        }
    }
}
