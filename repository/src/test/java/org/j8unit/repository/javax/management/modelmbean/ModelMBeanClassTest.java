package org.j8unit.repository.javax.management.modelmbean;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ModelMBeanClassTest
implements org.j8unit.repository.javax.management.modelmbean.ModelMBeanClassTests<javax.management.modelmbean.ModelMBean> {

    @Override
    public Class<javax.management.modelmbean.ModelMBean> createNewSUT() {
        return javax.management.modelmbean.ModelMBean.class;
    }

}
