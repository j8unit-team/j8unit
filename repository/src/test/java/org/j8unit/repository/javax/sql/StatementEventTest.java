package org.j8unit.repository.javax.sql;

import javax.sql.StatementEvent;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link StatementEvent} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.javax.sql.StatementEventTests}).
 */

@RunWith(J8Unit4.class)
public class StatementEventTest
implements StatementEventTests<StatementEvent> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.sql.StatementEvent]

    @Override
    public StatementEvent createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.sql.StatementEvent], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.sql.StatementEvent]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.sql.StatementEvent]

}
