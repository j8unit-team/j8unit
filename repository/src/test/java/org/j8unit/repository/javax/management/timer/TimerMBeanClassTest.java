package org.j8unit.repository.javax.management.timer;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class TimerMBeanClassTest
implements org.j8unit.repository.javax.management.timer.TimerMBeanClassTests<javax.management.timer.TimerMBean> {

    @Override
    public Class<javax.management.timer.TimerMBean> createNewSUT() {
        return javax.management.timer.TimerMBean.class;
    }

}
