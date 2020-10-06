package org.example;

import org.junit.Assert;
import org.junit.Test;

import java.util.*;

/**
 * Unit test for simple App.
 */
public class PersonTest {

    @Test
    public void arrayOfPersons() {
        Person[] people = new Person[3];

        for (int i = 0; i < people.length; i++) {
            people[i] = new Person("Person" + i);
        }

        for (int i = 0; i < people.length; i++) {
            System.out.println(people[i]);
        }

        for (Person person : people) {
            System.out.println(person);
        }
    }

    @Test
    public void addDifferentPersonTypes() {

        Person[] people = new Person[11];

        for (int i = 0; i < people.length; i++) {
            if (i % 3 == 0) {
                people[i] = new Person("Person" + i);
            } else if (i % 3 == 1) {
                people[i] = new Employee("Person" + i);
            } else {
                people[i] = new Unemployed("Person" + i);
            }
        }

        for (Person person : people) {
            System.out.println(person);
        }
    }

    @Test
    public void addDifferentPersonTypesInArrayList() {

        List<Person> people = new ArrayList<>();

        for (int i = 0; i < 11; i++) {
            if (i % 3 == 0) {
                people.add(new Person("Person" + i));
            } else if (i % 3 == 1) {
                people.add(new Employee("Person" + i));
            } else {
                people.add(new Unemployed("Person" + i));
            }
        }

        for (Person person : people) {
            System.out.println(person);
        }
    }

    @Test
    public void addDifferentPersonTypesInLinkedList() {

        List<Person> people = new LinkedList<>();

        for (int i = 0; i < 11; i++) {
            if (i % 3 == 0) {
                people.add(new Person("Person" + i));
            } else if (i % 3 == 1) {
                people.add(new Employee("Person" + i));
            } else {
                people.add(new Unemployed("Person" + i));
            }
        }

        for (Person person : people) {
            System.out.println(person);
        }
    }

    @Test
    public void addElementsInSet(){
        Set<Person> persons = new HashSet<>();

        Person ion1 = new Person("Ion");
        persons.add(ion1);
        persons.add(new Person("Andrei"));

        Person ion2 = new Person("Ion");
        persons.add(ion2);

        Person ion3 = new Person("Ion");
        persons.add(ion3);

        Assert.assertTrue(ion1.equals(ion2));

        Assert.assertEquals(2, persons.size(), 0);
    }

    @Test
    public void addElementInMap(){
        Map<String, Person> persons = new HashMap<>();
        persons.put("1", new Person("Ion"));
        persons.put("2", new Person("Pavel"));
        persons.put("1", new Person("Andrei"));

        // Assert.assertEquals(persons.get("1"), new Person("Ion"));
        Assert.assertEquals( new Person("Pavel"), persons.get("2"));
        Assert.assertEquals(new Person("Bond"), persons.get("007"));
    }

    @Test
    public void addElementInMapWithOwnKeyType(){
        Map<MyKey, Person> persons = new HashMap<>();
        persons.put(new MyKey("1"), new Person("Ion"));
        persons.put(new MyKey("2"), new Person("Pavel"));
        persons.put(new MyKey("1"), new Person("Andrei"));

        // Assert.assertEquals(persons.get("1"), new Person("Ion"));
        Assert.assertEquals( new Person("Pavel"), persons.get(new MyKey("2")));
        // Assert.assertEquals(new Person("Bond"), persons.get(new MyKey("007")));

        for (MyKey key: persons.keySet()) {
            System.out.println(persons.get(key));
        }

        for (Map.Entry<MyKey, Person> pair: persons.entrySet()) {
            // System.out.println(persons.get(pair.getKey()));
            System.out.println(pair.getValue());
        }
    }
}
