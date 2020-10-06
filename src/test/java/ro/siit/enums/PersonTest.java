package ro.siit.enums;

import org.junit.Test;

public class PersonTest {
    @Test
    public void testPersonCreation(){
        Person p = new Person("John Foe", Gender.N);
    }
}
