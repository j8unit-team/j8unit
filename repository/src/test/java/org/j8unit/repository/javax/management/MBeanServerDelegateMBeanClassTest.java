package org.j8unit.repository.javax.management;

import javax.management.MBeanServerDelegateMBean;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link MBeanServerDelegateMBean} (by simply
 * reusing the J8Unit test interface {@link MBeanServerDelegateMBeanClassTests}).
 */

@RunWith(J8Unit4.class)
public class MBeanServerDelegateMBeanClassTest
implements MBeanServerDelegateMBeanClassTests<MBeanServerDelegateMBean> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.management.MBeanServerDelegateMBean]

    @Override
    public Class<MBeanServerDelegateMBean> createNewSUT() {
        return MBeanServerDelegateMBean.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.management.MBeanServerDelegateMBean]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.management.MBeanServerDelegateMBean]

}
