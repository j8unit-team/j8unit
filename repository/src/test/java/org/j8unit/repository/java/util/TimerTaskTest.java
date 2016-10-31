package org.j8unit.repository.java.util;

import java.util.TimerTask;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class TimerTaskTest
implements org.j8unit.repository.java.util.TimerTaskTests<TimerTask> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.TimerTask]

    @Override
    public TimerTask createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.util.TimerTask], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.util.TimerTask]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.util.TimerTask]

}
