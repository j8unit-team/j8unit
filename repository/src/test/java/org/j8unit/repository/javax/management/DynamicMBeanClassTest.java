package org.j8unit.repository.javax.management;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DynamicMBeanClassTest
implements org.j8unit.repository.javax.management.DynamicMBeanClassTests<javax.management.DynamicMBean> {

    @Override
    public Class<javax.management.DynamicMBean> createNewSUT() {
        return javax.management.DynamicMBean.class;
    }

}
