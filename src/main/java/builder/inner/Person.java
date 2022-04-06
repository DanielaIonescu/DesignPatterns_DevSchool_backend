package builder.inner;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import static org.apache.commons.lang3.StringUtils.isNotEmpty;

@Getter
@Setter
@NoArgsConstructor
public class Person {
    private String name;
    private String surname;
    private String age;
    private String gender;
    private String address;
    private String planetOfResidence;

    public static PersonBuilder builder() {
        return new PersonBuilder();
    }

    public Person(PersonBuilder builder) {
        this.name = builder.name;
        this.surname = builder.surname;
        this.age = builder.age;
        this.gender = builder.gender;
        this.address = builder.address;
        this.planetOfResidence = builder.planetOfResidence;
    }

    public static class PersonBuilder {
        private String name;
        private String surname;
        private String age;
        private String gender;
        private String address;
        private String planetOfResidence;

        public Person build() {
            return new Person(this);
        }

        public PersonBuilder name(String name) {
            this.name = name;
            return this;
        }

        public PersonBuilder surname(String surname) {
            this.surname = surname;
            return this;
        }

        public PersonBuilder age(String age) {
            this.age = age;
            return this;
        }

        public PersonBuilder gender(String gender) {
            this.gender = gender;
            return this;
        }

        public PersonBuilder address(String address) {
            this.address = address;
            return this;
        }

        public PersonBuilder planetOfResidence(String planetOfResidence) {
            this.planetOfResidence = planetOfResidence;
            return this;
        }

    }

    @Override
    public String toString() {
        StringBuilder toString = new StringBuilder("Person: \n");
        if (isNotEmpty(name)) {
            toString.append("name='").append(name).append('\'').append("\n");
        }
        if (isNotEmpty(surname)) {
            toString.append("surname='").append(surname).append('\'').append("\n");
        }
        if (isNotEmpty(age)) {
            toString.append("age='").append(age).append('\'').append("\n");
        }
        if (isNotEmpty(gender)) {
            toString.append("gender='").append(gender).append('\'').append("\n");
        }
        if (isNotEmpty(address)) {
            toString.append("address='").append(address).append('\'').append("\n");
        }
        if (isNotEmpty(planetOfResidence)) {
            toString.append("planetOfResidence='").append(planetOfResidence).append('\'').append("\n");
        }
        toString.append("\n");

        return toString.toString();
    }
}
