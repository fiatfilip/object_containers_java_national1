package org.example;

import java.util.Comparator;

public class ComparableType implements Comparable<ComparableType>{
    String criteriul1;
    Integer criteriul2;
    Integer criteriul3;

    public ComparableType(String criteriul1, Integer criteriul2, Integer criteriul3) {
        this.criteriul1 = criteriul1;
        this.criteriul2 = criteriul2;
        this.criteriul3 = criteriul3;
    }


    @Override
    public int compareTo(ComparableType o) {
        return this.criteriul1.compareTo(o.criteriul1);
    }

    @Override
    public String toString() {
        return "ComparableType{" +
                "criteriul1='" + criteriul1 + '\'' +
                ", criteriul2=" + criteriul2 +
                ", criteriul3=" + criteriul3 +
                '}';
    }
}

class Criteriul2Comparator implements Comparator<ComparableType>{

    @Override
    public int compare(ComparableType o1, ComparableType o2) {
        return o1.criteriul2.compareTo(o2.criteriul2);
    }
}

class Criteriul3Comparator implements Comparator<ComparableType>{

    @Override
    public int compare(ComparableType o1, ComparableType o2) {
        return o1.criteriul3.compareTo(o2.criteriul3);
    }
}
