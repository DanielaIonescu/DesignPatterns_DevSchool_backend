package observer.time.observer;

import lombok.Getter;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import static java.lang.String.format;
import static java.time.LocalTime.parse;
import static java.time.format.DateTimeFormatter.ofPattern;

public class AnalogClock implements Observer {
    private final DateTimeFormatter formatter = ofPattern("HH:mm:ss.SSS");
    @Getter
    private LocalTime time;

    @Override
    public void update(String time) {
        System.out.println(format("AnalogClock hour updated from: %s to: %s.", this.time, time));
        this.time = parse(time, formatter);
    }
}
