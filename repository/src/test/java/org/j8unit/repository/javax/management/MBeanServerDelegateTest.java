package org.j8unit.repository.javax.management;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class MBeanServerDelegateTest
implements org.j8unit.repository.javax.management.MBeanServerDelegateTests<javax.management.MBeanServerDelegate> {

    @Override
    public javax.management.MBeanServerDelegate createNewSUT() {
        return new javax.management.MBeanServerDelegate();
    }

}
