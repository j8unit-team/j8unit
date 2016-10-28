package org.j8unit.repository.javax.management.modelmbean;

import javax.management.modelmbean.ModelMBean;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ModelMBeanTest
implements org.j8unit.repository.javax.management.modelmbean.ModelMBeanTests<ModelMBean> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.management.modelmbean.ModelMBean]

    @Override
    public ModelMBean createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.management.modelmbean.ModelMBean], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.management.modelmbean.ModelMBean]

}
