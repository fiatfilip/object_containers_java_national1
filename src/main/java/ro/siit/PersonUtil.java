package ro.siit;

import org.example.Person;
import org.example.Unemployed;

import java.util.ArrayList;
import java.util.List;

public class PersonUtil {
    void addPersoane1(List<? extends Person> persons){
        // persons.add(new Unemployed("Johann"));
        // persons.add(new Person("Ana"));
        List<Person> altii = new ArrayList<>();
        altii.addAll(persons);
        for (Person person: persons) {
            person.getName();
        }
    }

    void addPersoane2(List<? super Person> persons){
        persons.add(new Unemployed("Johann"));
        persons.add(new Person("Johann"));
    }
}
