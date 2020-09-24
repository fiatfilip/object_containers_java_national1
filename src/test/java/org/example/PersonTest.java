package org.example;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class PersonTest
{

    @Test
    public void arrayOfPersons()
    {
        Person[] people = new Person[3];

        for ( int i = 0; i < people.length; i++) {
            people[i] = new Person("Person" + i);
        }

        for ( int i = 0; i < people.length; i++) {
            System.out.println(people[i]);
        }

        for(Person person: people ) {
            System.out.println(person);
        }
    }

    @Test
    public void addDifferentPersonTypes () {

        Person[] people = new Person[11];

        for ( int i = 0; i < people.length; i++) {
            if (i % 3 == 0) {
                people[i] = new Person("Person" + i);
            } else if ( i % 3 == 1) {
                people[i] = new Employee("Person" + i);
            } else {
                people[i] = new Unemployed("Person" + i);
            }
        }

        for(Person person: people ) {
            System.out.println(person);
        }
    }
}
