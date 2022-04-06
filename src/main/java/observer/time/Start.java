package observer.time;


import observer.time.observable.ClockTimer;
import observer.time.observable.Observable;
import observer.time.observer.AnalogClock;
import observer.time.observer.DigitalClock;

/**
 * Define a one-to-many dependency between objects so that when one object changes
 * state, all its dependents are notified and update automatically.
 * <p>
 * Also Known As
 * Dependents, Publish-Subscribe
 */
public class Start {

    public static void main(String[] args) {
        Observable clockTimer = new ClockTimer();
        DigitalClock digitalClock = new DigitalClock();
        AnalogClock analogClock = new AnalogClock();

        clockTimer.addObserver(digitalClock);
        clockTimer.addObserver(analogClock);

        clockTimer.tick();

        clockTimer.removeObserver(digitalClock);
        clockTimer.tick();
    }
}
