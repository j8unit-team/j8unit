package org.j8unit.repository.javax.management.modelmbean;

import javax.management.modelmbean.ModelMBeanInfo;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ModelMBeanInfoTest
implements org.j8unit.repository.javax.management.modelmbean.ModelMBeanInfoTests<ModelMBeanInfo> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.management.modelmbean.ModelMBeanInfo]

    @Override
    public ModelMBeanInfo createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.management.modelmbean.ModelMBeanInfo], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.management.modelmbean.ModelMBeanInfo]

}
