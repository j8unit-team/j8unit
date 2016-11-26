package org.j8unit.repository.java.lang;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link Runnable} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.lang.RunnableTests}).
 */
@RunWith(J8Unit4.class)
public class RunnableTest
implements RunnableTests<Runnable> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.lang.Runnable]

    @Override
    public Runnable createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.lang.Runnable], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.lang.Runnable]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.lang.Runnable]

}
