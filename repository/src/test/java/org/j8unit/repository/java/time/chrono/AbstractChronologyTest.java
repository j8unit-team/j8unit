package org.j8unit.repository.java.time.chrono;

import java.time.chrono.AbstractChronology;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link AbstractChronology} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.java.time.chrono.AbstractChronologyTests}).
 */
@RunWith(J8Unit4.class)
public class AbstractChronologyTest
implements AbstractChronologyTests<AbstractChronology> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.time.chrono.AbstractChronology]

    @Override
    public AbstractChronology createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.time.chrono.AbstractChronology], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.time.chrono.AbstractChronology]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.time.chrono.AbstractChronology]

}
