package org.j8unit.repository.javax.management;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class MBeanServerDelegateMBeanClassTest
implements org.j8unit.repository.javax.management.MBeanServerDelegateMBeanClassTests<javax.management.MBeanServerDelegateMBean> {

    @Override
    public Class<javax.management.MBeanServerDelegateMBean> createNewSUT() {
        return javax.management.MBeanServerDelegateMBean.class;
    }

}
