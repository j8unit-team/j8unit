package org.j8unit.repository.javax.management.modelmbean;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class RequiredModelMBeanClassTest
implements org.j8unit.repository.javax.management.modelmbean.RequiredModelMBeanClassTests<javax.management.modelmbean.RequiredModelMBean> {

    @Override
    public Class<javax.management.modelmbean.RequiredModelMBean> createNewSUT() {
        return javax.management.modelmbean.RequiredModelMBean.class;
    }

}
