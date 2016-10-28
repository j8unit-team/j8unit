package org.j8unit.repository.java.lang;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class StackTraceElementTest
implements org.j8unit.repository.java.lang.StackTraceElementTests<StackTraceElement> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.lang.StackTraceElement]

    @Override
    public StackTraceElement createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.lang.StackTraceElement], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.lang.StackTraceElement]

}
