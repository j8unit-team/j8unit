package org.j8unit.repository.java.util;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class WeakHashMapTest<K, V>
implements org.j8unit.repository.java.util.WeakHashMapTests<java.util.WeakHashMap<K, V>, K, V> {

    @Override
    public java.util.WeakHashMap<K, V> createNewSUT() {
        return new java.util.WeakHashMap<>();
    }

}
