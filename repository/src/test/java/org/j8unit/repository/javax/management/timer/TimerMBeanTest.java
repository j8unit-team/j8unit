package org.j8unit.repository.javax.management.timer;

import javax.management.timer.TimerMBean;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class TimerMBeanTest
implements org.j8unit.repository.javax.management.timer.TimerMBeanTests<TimerMBean> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.management.timer.TimerMBean]

    @Override
    public TimerMBean createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.management.timer.TimerMBean], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.management.timer.TimerMBean]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.management.timer.TimerMBean]

}
