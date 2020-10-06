package org.example;

import java.util.Objects;

public class Person {
    private String name;
    private String surname;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " {" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return this.name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return name.equals(person.name);
                // && surname.equals(person.surname);//Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);// + Objects.hash(surname);
    }
}
