package org.j8unit.repository.java.util;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class IdentityHashMapTest<K, V>
implements org.j8unit.repository.java.util.IdentityHashMapTests<java.util.IdentityHashMap<K, V>, K, V> {

    @Override
    public java.util.IdentityHashMap<K, V> createNewSUT() {
        return new java.util.IdentityHashMap();
    }

}
