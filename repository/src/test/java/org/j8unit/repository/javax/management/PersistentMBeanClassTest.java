package org.j8unit.repository.javax.management;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PersistentMBeanClassTest
implements org.j8unit.repository.javax.management.PersistentMBeanClassTests<javax.management.PersistentMBean> {

    @Override
    public Class<javax.management.PersistentMBean> createNewSUT() {
        return javax.management.PersistentMBean.class;
    }

}
