package org.j8unit.repository.java.util;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class EnumMapTest<K extends java.lang.Enum<K>, V>
implements org.j8unit.repository.java.util.EnumMapTests<java.util.EnumMap<K, V>, K, V> {

    @Override
    public java.util.EnumMap<K, V> createNewSUT() {
        throw new AssumptionViolatedException("There is no default constructor for [java.util.EnumMap] available.");
    }

}
