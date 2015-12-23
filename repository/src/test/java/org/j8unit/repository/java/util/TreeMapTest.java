package org.j8unit.repository.java.util;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class TreeMapTest<K, V>
implements org.j8unit.repository.java.util.TreeMapTests<java.util.TreeMap<K, V>, K, V> {

    @Override
    public java.util.TreeMap<K, V> createNewSUT() {
        return new java.util.TreeMap();
    }

}
