package ro.siit;

import org.example.Employee;
import org.example.Person;
import org.example.Unemployed;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        PersonUtil personUtil = new PersonUtil();

        List<Employee> employees = new ArrayList<>();
        personUtil.addPersoane1(employees);

        List<Unemployed> unemployedList = new ArrayList<>();
        personUtil.addPersoane1(unemployedList);

        List<Person> personList = new ArrayList<>();
        personUtil.addPersoane2(personList);

        Box<Integer> box1  = new Box<>(Integer.valueOf(2));
        // box1.setContent("Ana");
        System.out.println(box1.getContent() + 2);

        Box<?> box2 = new Box<>("ana");
        Map<String, Integer> map = new HashMap<>();

    }
}
