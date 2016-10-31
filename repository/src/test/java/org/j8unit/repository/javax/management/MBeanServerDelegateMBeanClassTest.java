package org.j8unit.repository.javax.management;

import javax.management.MBeanServerDelegateMBean;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class MBeanServerDelegateMBeanClassTest
implements org.j8unit.repository.javax.management.MBeanServerDelegateMBeanClassTests<MBeanServerDelegateMBean> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.management.MBeanServerDelegateMBean]

    @Override
    public Class<MBeanServerDelegateMBean> createNewSUT() {
        return MBeanServerDelegateMBean.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.management.MBeanServerDelegateMBean]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.management.MBeanServerDelegateMBean]

}
