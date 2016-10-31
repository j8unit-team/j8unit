package org.j8unit.repository.javax.management;

import javax.management.DynamicMBean;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DynamicMBeanClassTest
implements org.j8unit.repository.javax.management.DynamicMBeanClassTests<DynamicMBean> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.management.DynamicMBean]

    @Override
    public Class<DynamicMBean> createNewSUT() {
        return DynamicMBean.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.management.DynamicMBean]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.management.DynamicMBean]

}
