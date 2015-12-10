package org.j8unit.repository.javax.management.modelmbean;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ModelMBeanInfoClassTest
implements org.j8unit.repository.javax.management.modelmbean.ModelMBeanInfoClassTests<javax.management.modelmbean.ModelMBeanInfo> {

    @Override
    public Class<javax.management.modelmbean.ModelMBeanInfo> createNewSUT() {
        return javax.management.modelmbean.ModelMBeanInfo.class;
    }

}
