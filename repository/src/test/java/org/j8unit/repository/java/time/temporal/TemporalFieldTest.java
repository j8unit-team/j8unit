package org.j8unit.repository.java.time.temporal;

import java.time.temporal.TemporalField;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link TemporalField} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.time.temporal.TemporalFieldTests}).
 */

@RunWith(J8Unit4.class)
public class TemporalFieldTest
implements TemporalFieldTests<TemporalField> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.time.temporal.TemporalField]

    @Override
    public TemporalField createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.time.temporal.TemporalField], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.time.temporal.TemporalField]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.time.temporal.TemporalField]

}
