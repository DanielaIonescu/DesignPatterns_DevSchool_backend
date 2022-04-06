package mediator;

import java.util.HashMap;
import java.util.Map;

public class ChatRoom implements Chat {
    private final Map<String, User> usersMap = new HashMap<>();

    @Override
    public void sendMessage(String msg, String userId) {
        User user = usersMap.get(userId);
        user.receive(msg);
    }

    @Override
    public void addUser(User user) {
        this.usersMap.put(user.getId(), user);
    }
}
