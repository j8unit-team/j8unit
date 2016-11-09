package org.j8unit.repository.java.lang;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link AutoCloseable} (by simply reusing the
 * J8Unit test interface {@link AutoCloseableClassTests}).
 */

@RunWith(J8Unit4.class)
public class AutoCloseableClassTest
implements AutoCloseableClassTests<AutoCloseable> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.lang.AutoCloseable]

    @Override
    public Class<AutoCloseable> createNewSUT() {
        return AutoCloseable.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.lang.AutoCloseable]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.lang.AutoCloseable]

}
