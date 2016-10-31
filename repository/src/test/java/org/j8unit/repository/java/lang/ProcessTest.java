package org.j8unit.repository.java.lang;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ProcessTest
implements org.j8unit.repository.java.lang.ProcessTests<Process> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.lang.Process]

    @Override
    public Process createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.lang.Process], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.lang.Process]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.lang.Process]

}
