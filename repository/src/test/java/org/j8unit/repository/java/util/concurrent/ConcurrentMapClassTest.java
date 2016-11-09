package org.j8unit.repository.java.util.concurrent;

import java.util.concurrent.ConcurrentMap;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link ConcurrentMap} (by simply reusing the
 * J8Unit test interface {@link ConcurrentMapClassTests}).
 */
@SuppressWarnings("rawtypes")
@RunWith(J8Unit4.class)
public class ConcurrentMapClassTest
implements ConcurrentMapClassTests<ConcurrentMap> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.concurrent.ConcurrentMap]

    @Override
    public Class<ConcurrentMap> createNewSUT() {
        return ConcurrentMap.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.util.concurrent.ConcurrentMap]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.util.concurrent.ConcurrentMap]

}
