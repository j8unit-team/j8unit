package org.j8unit.repository.java.util;

import java.util.Dictionary;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link Dictionary} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.util.DictionaryTests}).
 */

@RunWith(J8Unit4.class)
public class DictionaryTest<K, V>
implements DictionaryTests<Dictionary<K, V>, K, V> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.Dictionary]

    @Override
    public Dictionary<K, V> createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.util.Dictionary], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.util.Dictionary]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.util.Dictionary]

}
