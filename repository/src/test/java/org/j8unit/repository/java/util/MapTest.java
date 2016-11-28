package org.j8unit.repository.java.util;

import java.util.Map;
import java.util.Map.Entry;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link Map} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.java.util.MapTests}).
 */
@RunWith(J8Unit4.class)
public class MapTest<K, V>
implements MapTests<Map<K, V>, K, V> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.Map]

    @Override
    public Map<K, V> createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.util.Map], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.util.Map]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.util.Map]

    /**
     * Specific JUnit test class to proof the instance relevant aspects of type {@link Entry} (by simply reusing the
     * J8Unit test interface {@link org.j8unit.repository.java.util.MapTests.EntryTests}).
     */
    @RunWith(J8Unit4.class)
    public static class EntryTest<K, V>
    implements org.j8unit.repository.java.util.MapTests.EntryTests<Entry<K, V>, K, V> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.Map$Entry]

        @Override
        public Entry<K, V> createNewSUT() {
            throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.util.Map.Entry], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.util.Map$Entry]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[java.util.Map$Entry]

    }

}
