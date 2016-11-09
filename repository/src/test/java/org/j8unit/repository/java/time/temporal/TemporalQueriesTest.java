package org.j8unit.repository.java.time.temporal;

import java.time.temporal.TemporalQueries;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link TemporalQueries} (by simply reusing
 * the J8Unit test interface {@link TemporalQueriesTests}).
 */

@RunWith(J8Unit4.class)
public class TemporalQueriesTest
implements TemporalQueriesTests<TemporalQueries> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.time.temporal.TemporalQueries]

    @Override
    public TemporalQueries createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.time.temporal.TemporalQueries], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.time.temporal.TemporalQueries]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.time.temporal.TemporalQueries]

}
