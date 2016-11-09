package org.j8unit.repository.java.util.concurrent;

import java.util.concurrent.ConcurrentNavigableMap;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link ConcurrentNavigableMap} (by simply
 * reusing the J8Unit test interface {@link ConcurrentNavigableMapClassTests}).
 */
@SuppressWarnings("rawtypes")
@RunWith(J8Unit4.class)
public class ConcurrentNavigableMapClassTest
implements ConcurrentNavigableMapClassTests<ConcurrentNavigableMap> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.concurrent.ConcurrentNavigableMap]

    @Override
    public Class<ConcurrentNavigableMap> createNewSUT() {
        return ConcurrentNavigableMap.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.util.concurrent.ConcurrentNavigableMap]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.util.concurrent.ConcurrentNavigableMap]

}
