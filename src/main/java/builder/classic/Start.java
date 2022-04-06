package builder.classic;

public class Start {
    public static void main(String[] args) {
        Person person = new PersonBuilder().name("Marian").planetOfResidence("Mars").build();
        System.out.println(person);
        Person secondPerson = new PersonBuilder().surname("John").age("44").build();
        System.out.println(secondPerson);
    }
}
