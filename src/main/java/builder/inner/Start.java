package builder.inner;

public class Start {
    public static void main(String[] args) {
        Person person = Person.builder().name("John").planetOfResidence("Mars").build();
        System.out.println(person);
        Person secondPerson = Person.builder().surname("Mary").age("44").build();
        System.out.println(secondPerson);
    }
}
