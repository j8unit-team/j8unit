package org.j8unit.repository.javax.management.modelmbean;

import javax.management.modelmbean.ModelMBeanInfo;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ModelMBeanInfoClassTest
implements org.j8unit.repository.javax.management.modelmbean.ModelMBeanInfoClassTests<ModelMBeanInfo> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.management.modelmbean.ModelMBeanInfo]

    @Override
    public Class<ModelMBeanInfo> createNewSUT() {
        return ModelMBeanInfo.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.management.modelmbean.ModelMBeanInfo]

}
