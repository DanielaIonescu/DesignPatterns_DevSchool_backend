package observer.simple;

public interface Observable {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void sendMessage(String message);
}
