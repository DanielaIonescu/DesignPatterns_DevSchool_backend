package mediator;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public abstract class User {
    private Chat mediator;
    private String id;
    private String name;

    public abstract void send(String message, String userId);

    public abstract void receive(String message);

}
