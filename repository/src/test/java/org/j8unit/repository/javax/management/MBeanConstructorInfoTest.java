package org.j8unit.repository.javax.management;

import javax.management.MBeanConstructorInfo;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class MBeanConstructorInfoTest
implements org.j8unit.repository.javax.management.MBeanConstructorInfoTests<MBeanConstructorInfo> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.management.MBeanConstructorInfo]

    @Override
    public MBeanConstructorInfo createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.management.MBeanConstructorInfo], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.management.MBeanConstructorInfo]

}
