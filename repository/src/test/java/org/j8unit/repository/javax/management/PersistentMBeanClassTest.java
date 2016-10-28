package org.j8unit.repository.javax.management;

import javax.management.PersistentMBean;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PersistentMBeanClassTest
implements org.j8unit.repository.javax.management.PersistentMBeanClassTests<PersistentMBean> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.management.PersistentMBean]

    @Override
    public Class<PersistentMBean> createNewSUT() {
        return PersistentMBean.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.management.PersistentMBean]

}
