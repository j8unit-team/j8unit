package org.j8unit.repository.javax.management.openmbean;

import javax.management.openmbean.OpenMBeanInfo;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class OpenMBeanInfoTest
implements org.j8unit.repository.javax.management.openmbean.OpenMBeanInfoTests<OpenMBeanInfo> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.management.openmbean.OpenMBeanInfo]

    @Override
    public OpenMBeanInfo createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.management.openmbean.OpenMBeanInfo], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.management.openmbean.OpenMBeanInfo]

}
