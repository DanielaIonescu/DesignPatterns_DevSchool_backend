package builder.classic;

import lombok.Getter;
import lombok.Setter;

import static org.apache.commons.lang3.StringUtils.isNotEmpty;

@Getter
@Setter
public class Person {
    private String name;
    private String surname;
    private String age;
    private String gender;
    private String address;
    private String planetOfResidence;

    public Person() {

    }

    public Person(String name, String surname, String age, String gender, String address, String planetOfResidence) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.gender = gender;
        this.address = address;
        this.planetOfResidence = planetOfResidence;
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
