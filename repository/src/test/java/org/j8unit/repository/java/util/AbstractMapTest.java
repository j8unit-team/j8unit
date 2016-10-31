package org.j8unit.repository.java.util;

import java.util.AbstractMap;
import java.util.AbstractMap.SimpleEntry;
import java.util.AbstractMap.SimpleImmutableEntry;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AbstractMapTest<K, V>
implements org.j8unit.repository.java.util.AbstractMapTests<AbstractMap<K, V>, K, V> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.AbstractMap]

    @Override
    public AbstractMap<K, V> createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.util.AbstractMap], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.util.AbstractMap]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.util.AbstractMap]

    @RunWith(J8Unit4.class)
    public static class SimpleImmutableEntryTest<K, V>
    implements org.j8unit.repository.java.util.AbstractMapTests.SimpleImmutableEntryTests<SimpleImmutableEntry<K, V>, K, V> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.AbstractMap$SimpleImmutableEntry]

        @Override
        public SimpleImmutableEntry<K, V> createNewSUT() {
            throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.util.AbstractMap.SimpleImmutableEntry], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.util.AbstractMap$SimpleImmutableEntry]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[java.util.AbstractMap$SimpleImmutableEntry]

    }

    @RunWith(J8Unit4.class)
    public static class SimpleEntryTest<K, V>
    implements org.j8unit.repository.java.util.AbstractMapTests.SimpleEntryTests<SimpleEntry<K, V>, K, V> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.AbstractMap$SimpleEntry]

        @Override
        public SimpleEntry<K, V> createNewSUT() {
            throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.util.AbstractMap.SimpleEntry], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.util.AbstractMap$SimpleEntry]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[java.util.AbstractMap$SimpleEntry]

    }

}
