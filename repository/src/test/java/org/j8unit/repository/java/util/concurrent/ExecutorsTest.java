package org.j8unit.repository.java.util.concurrent;

import java.util.concurrent.Executors;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link Executors} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.util.concurrent.ExecutorsTests}).
 */
@RunWith(J8Unit4.class)
public class ExecutorsTest
implements ExecutorsTests<Executors> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.concurrent.Executors]

    @Override
    public Executors createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.util.concurrent.Executors], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.util.concurrent.Executors]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.util.concurrent.Executors]

}
