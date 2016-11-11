package org.j8unit.repository.java.util.concurrent;

import java.util.concurrent.Delayed;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link Delayed} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.util.concurrent.DelayedTests}).
 */

@RunWith(J8Unit4.class)
public class DelayedTest
implements DelayedTests<Delayed> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.concurrent.Delayed]

    @Override
    public Delayed createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.util.concurrent.Delayed], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.util.concurrent.Delayed]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.util.concurrent.Delayed]

}
