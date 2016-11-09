package org.j8unit.repository.java.util;

import java.util.SortedMap;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link SortedMap} (by simply reusing the
 * J8Unit test interface {@link SortedMapTests}).
 */

@RunWith(J8Unit4.class)
public class SortedMapTest<K, V>
implements SortedMapTests<SortedMap<K, V>, K, V> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.SortedMap]

    @Override
    public SortedMap<K, V> createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.util.SortedMap], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.util.SortedMap]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.util.SortedMap]

}
