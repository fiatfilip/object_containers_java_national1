package org.example;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComaprableTest {
    @Test
    public void testNaturalOrder(){
        List<ComparableType> comparabile = new ArrayList<>();

        comparabile.add(new ComparableType("xenia", 100, 15));
        comparabile.add(new ComparableType("ana", 1000, 12));
        comparabile.add(new ComparableType("dana", 101, 24));

        for (ComparableType elem: comparabile) {
            System.out.println(elem);
        }

        Collections.sort(comparabile);
        System.out.println("......");
        for (ComparableType elem: comparabile) {
            System.out.println(elem);
        }

        Collections.sort(comparabile, new Criteriul2Comparator());
        System.out.println("......");
        for (ComparableType elem: comparabile) {
            System.out.println(elem);
        }

        Collections.sort(comparabile, new Criteriul3Comparator());
        System.out.println("......");
        for (ComparableType elem: comparabile) {
            System.out.println(elem);
        }

    }
}
