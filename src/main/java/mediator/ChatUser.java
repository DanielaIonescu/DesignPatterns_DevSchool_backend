package mediator;

public class ChatUser extends User {

    public ChatUser(Chat room, String id, String name) {
        super(room, id, name);
    }

    @Override
    public void send(String message, String userId) {
        System.out.println(this.getName() + " :: Sending Message : " + message);
        getMediator().sendMessage(message, userId);
    }

    @Override
    public void receive(String message) {
        System.out.println(this.getName() + " :: Received Message : " + message);
    }
}
