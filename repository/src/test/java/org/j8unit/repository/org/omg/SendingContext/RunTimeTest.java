package org.j8unit.repository.org.omg.SendingContext;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.omg.SendingContext.RunTime;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link RunTime} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.org.omg.SendingContext.RunTimeTests}).
 */
@RunWith(J8Unit4.class)
public class RunTimeTest
implements RunTimeTests<RunTime> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.omg.SendingContext.RunTime]

    @Override
    public RunTime createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [org.omg.SendingContext.RunTime], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[org.omg.SendingContext.RunTime]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[org.omg.SendingContext.RunTime]

}
