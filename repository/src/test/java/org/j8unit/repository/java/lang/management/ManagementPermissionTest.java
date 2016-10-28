package org.j8unit.repository.java.lang.management;

import java.lang.management.ManagementPermission;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ManagementPermissionTest
implements org.j8unit.repository.java.lang.management.ManagementPermissionTests<ManagementPermission> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.lang.management.ManagementPermission]

    @Override
    public ManagementPermission createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.lang.management.ManagementPermission], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.lang.management.ManagementPermission]

}
