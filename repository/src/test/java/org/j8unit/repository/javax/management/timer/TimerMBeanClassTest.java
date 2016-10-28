package org.j8unit.repository.javax.management.timer;

import javax.management.timer.TimerMBean;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class TimerMBeanClassTest
implements org.j8unit.repository.javax.management.timer.TimerMBeanClassTests<TimerMBean> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.management.timer.TimerMBean]

    @Override
    public Class<TimerMBean> createNewSUT() {
        return TimerMBean.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.management.timer.TimerMBean]

}
