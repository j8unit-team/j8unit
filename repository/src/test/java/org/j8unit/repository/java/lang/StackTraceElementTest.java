package org.j8unit.repository.java.lang;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link StackTraceElement} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.java.lang.StackTraceElementTests}).
 */

@RunWith(J8Unit4.class)
public class StackTraceElementTest
implements StackTraceElementTests<StackTraceElement> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.lang.StackTraceElement]

    @Override
    public StackTraceElement createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.lang.StackTraceElement], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.lang.StackTraceElement]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.lang.StackTraceElement]

}
