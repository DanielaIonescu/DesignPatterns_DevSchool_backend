package observer.simple;


/**
 * Define a one-to-many dependency between objects so that when one object changes
 * state, all its dependents are notified and update automatically.
 *
 * Also Known As
 * Dependents, Publish-Subscribe
 *
 * For example, a site Newsletter can notify clients
 * (sent messages/emails) when it has news.
 *
 */
public class Start {

    public static void main(String[] args) {
        Observable observable = new Newsletter("LeetCode");
        Observer observerJohn = new Client("John");
        Observer observerMary = new Client("Mary");
        Observer observerKaramazov = new Client("Karamazov");

        observable.addObserver(observerJohn);
        observable.addObserver(observerMary);
        observable.sendMessage("New premium problem added. Come to solve it!");

        observable.addObserver(observerKaramazov);
        observable.removeObserver(observerJohn);
        observable.sendMessage("Times up. The code challenge results are here: link.");

    }
}
