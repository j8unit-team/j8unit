package org.j8unit.repository.java.util.concurrent;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ConcurrentHashMapTest<K, V>
implements org.j8unit.repository.java.util.concurrent.ConcurrentHashMapTests<java.util.concurrent.ConcurrentHashMap<K, V>, K, V> {

    @RunWith(J8Unit4.class)
    public static class KeySetViewTest<K, V>
    implements
    org.j8unit.repository.java.util.concurrent.ConcurrentHashMapTests.KeySetViewTests<java.util.concurrent.ConcurrentHashMap.KeySetView<K, V>, K, V> {

        @Override
        public java.util.concurrent.ConcurrentHashMap.KeySetView<K, V> createNewSUT() {
            throw new AssumptionViolatedException("There is no default constructor for [java.util.concurrent.ConcurrentHashMap.KeySetView] available.");
        }

    }

    @Override
    public java.util.concurrent.ConcurrentHashMap<K, V> createNewSUT() {
        return new java.util.concurrent.ConcurrentHashMap();
    }

}
