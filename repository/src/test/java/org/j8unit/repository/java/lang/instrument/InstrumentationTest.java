package org.j8unit.repository.java.lang.instrument;

import java.lang.instrument.Instrumentation;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link Instrumentation} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.java.lang.instrument.InstrumentationTests}).
 */
@RunWith(J8Unit4.class)
public class InstrumentationTest
implements InstrumentationTests<Instrumentation> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.lang.instrument.Instrumentation]

    @Override
    public Instrumentation createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.lang.instrument.Instrumentation], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.lang.instrument.Instrumentation]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.lang.instrument.Instrumentation]

}
