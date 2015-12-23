package org.j8unit.repository.java.util.concurrent;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ConcurrentSkipListMapTest<K, V>
implements org.j8unit.repository.java.util.concurrent.ConcurrentSkipListMapTests<java.util.concurrent.ConcurrentSkipListMap<K, V>, K, V> {

    @Override
    public java.util.concurrent.ConcurrentSkipListMap<K, V> createNewSUT() {
        return new java.util.concurrent.ConcurrentSkipListMap();
    }

}
