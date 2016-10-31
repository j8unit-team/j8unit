package org.j8unit.repository.org.omg.SendingContext;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.omg.SendingContext.RunTime;

@RunWith(J8Unit4.class)
public class RunTimeTest
implements org.j8unit.repository.org.omg.SendingContext.RunTimeTests<RunTime> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.omg.SendingContext.RunTime]

    @Override
    public RunTime createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [org.omg.SendingContext.RunTime], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[org.omg.SendingContext.RunTime]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[org.omg.SendingContext.RunTime]

}
