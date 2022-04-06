package mediator;

public interface Chat {
    public void sendMessage(String msg, String userId);

    void addUser(User user);
}
