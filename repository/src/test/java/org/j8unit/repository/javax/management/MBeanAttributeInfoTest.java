package org.j8unit.repository.javax.management;

import javax.management.MBeanAttributeInfo;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class MBeanAttributeInfoTest
implements org.j8unit.repository.javax.management.MBeanAttributeInfoTests<MBeanAttributeInfo> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.management.MBeanAttributeInfo]

    @Override
    public MBeanAttributeInfo createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.management.MBeanAttributeInfo], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.management.MBeanAttributeInfo]

}
