package org.j8unit.repository.javax.management.modelmbean;

import javax.management.modelmbean.ModelMBean;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ModelMBeanClassTest
implements org.j8unit.repository.javax.management.modelmbean.ModelMBeanClassTests<ModelMBean> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.management.modelmbean.ModelMBean]

    @Override
    public Class<ModelMBean> createNewSUT() {
        return ModelMBean.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.management.modelmbean.ModelMBean]

}
