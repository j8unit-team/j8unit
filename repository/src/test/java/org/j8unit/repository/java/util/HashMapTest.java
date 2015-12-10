package org.j8unit.repository.java.util;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class HashMapTest<K, V>
implements org.j8unit.repository.java.util.HashMapTests<java.util.HashMap<K, V>, K, V> {

    @Override
    public java.util.HashMap<K, V> createNewSUT() {
        return new java.util.HashMap();
    }

}
