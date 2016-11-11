package org.j8unit.repository.java.time.temporal;

import java.time.temporal.TemporalQuery;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link TemporalQuery} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.time.temporal.TemporalQueryTests}).
 */

@RunWith(J8Unit4.class)
public class TemporalQueryTest<R>
implements TemporalQueryTests<TemporalQuery<R>, R> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.time.temporal.TemporalQuery]

    @Override
    public TemporalQuery<R> createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.time.temporal.TemporalQuery], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.time.temporal.TemporalQuery]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.time.temporal.TemporalQuery]

}
