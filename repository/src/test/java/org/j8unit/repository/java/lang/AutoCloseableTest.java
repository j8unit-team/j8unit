package org.j8unit.repository.java.lang;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link AutoCloseable} (by simply reusing the
 * J8Unit test interface {@link AutoCloseableTests}).
 */

@RunWith(J8Unit4.class)
public class AutoCloseableTest
implements AutoCloseableTests<AutoCloseable> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.lang.AutoCloseable]

    @Override
    public AutoCloseable createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.lang.AutoCloseable], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.lang.AutoCloseable]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.lang.AutoCloseable]

}
