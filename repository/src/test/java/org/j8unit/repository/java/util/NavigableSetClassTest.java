package org.j8unit.repository.java.util;

import java.util.NavigableSet;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link NavigableSet} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.util.NavigableSetClassTests}).
 */
@SuppressWarnings("rawtypes")
@RunWith(J8Unit4.class)
public class NavigableSetClassTest
implements NavigableSetClassTests<NavigableSet> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.NavigableSet]

    @Override
    public Class<NavigableSet> createNewSUT() {
        return NavigableSet.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.util.NavigableSet]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.util.NavigableSet]

}
