package builder.classic;

public class PersonBuilder {
    private Person person;

    public PersonBuilder() {
        person = new Person();
    }

    public Person build() {
        return person;
    }

    public PersonBuilder name(String name) {
        person.setName(name);
        return this;
    }

    public PersonBuilder surname(String surname) {
        person.setSurname(surname);
        return this;
    }

    public PersonBuilder age(String age) {
        person.setAge(age);
        return this;
    }

    public PersonBuilder gender(String gender) {
        person.setGender(gender);
        return this;
    }

    public PersonBuilder address(String address) {
        person.setAddress(address);
        return this;
    }

    public PersonBuilder planetOfResidence(String planetOfResidence) {
        person.setPlanetOfResidence(planetOfResidence);
        return this;
    }
}
