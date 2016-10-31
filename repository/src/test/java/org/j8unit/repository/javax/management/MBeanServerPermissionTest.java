package org.j8unit.repository.javax.management;

import javax.management.MBeanServerPermission;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class MBeanServerPermissionTest
implements org.j8unit.repository.javax.management.MBeanServerPermissionTests<MBeanServerPermission> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.management.MBeanServerPermission]

    @Override
    public MBeanServerPermission createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.management.MBeanServerPermission], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.management.MBeanServerPermission]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.management.MBeanServerPermission]

}
