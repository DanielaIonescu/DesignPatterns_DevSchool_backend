package observer.simple;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Client implements Observer {
    private String clientName;
    @Override
    public void update(String message) {
        System.out.println(clientName + " received the message: " + message);
    }
}
