package org.j8unit.repository.java.util;

import java.util.NavigableMap;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link NavigableMap} (by simply reusing the
 * J8Unit test interface {@link NavigableMapClassTests}).
 */
@SuppressWarnings("rawtypes")
@RunWith(J8Unit4.class)
public class NavigableMapClassTest
implements NavigableMapClassTests<NavigableMap> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.NavigableMap]

    @Override
    public Class<NavigableMap> createNewSUT() {
        return NavigableMap.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.util.NavigableMap]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.util.NavigableMap]

}
