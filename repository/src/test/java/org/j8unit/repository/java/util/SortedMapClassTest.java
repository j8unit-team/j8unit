package org.j8unit.repository.java.util;

import java.util.SortedMap;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link SortedMap} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.java.util.SortedMapClassTests}).
 */
@SuppressWarnings("rawtypes")
@RunWith(J8Unit4.class)
public class SortedMapClassTest
implements SortedMapClassTests<SortedMap> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.SortedMap]

    @Override
    public Class<SortedMap> createNewSUT() {
        return SortedMap.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.util.SortedMap]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.util.SortedMap]

}
