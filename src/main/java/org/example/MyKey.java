package org.example;

import java.util.Objects;

public class MyKey {
    private String key;

    public MyKey(String key){
        this.key = key;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyKey myKey = (MyKey) o;
        return key.equals(myKey.key);
    }

    @Override
    public int hashCode() {
        return key.hashCode();
    }
}
