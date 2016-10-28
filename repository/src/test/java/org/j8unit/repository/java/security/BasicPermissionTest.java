package org.j8unit.repository.java.security;

import java.security.BasicPermission;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class BasicPermissionTest
implements org.j8unit.repository.java.security.BasicPermissionTests<BasicPermission> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.security.BasicPermission]

    @Override
    public BasicPermission createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.security.BasicPermission], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.security.BasicPermission]

}
