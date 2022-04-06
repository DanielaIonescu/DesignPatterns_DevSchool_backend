package observer.time.observable;

import observer.time.observer.Observer;

public interface Observable {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void tick();
}
