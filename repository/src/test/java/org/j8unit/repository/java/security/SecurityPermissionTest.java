package org.j8unit.repository.java.security;

import java.security.SecurityPermission;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SecurityPermissionTest
implements org.j8unit.repository.java.security.SecurityPermissionTests<SecurityPermission> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.security.SecurityPermission]

    @Override
    public SecurityPermission createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.security.SecurityPermission], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.security.SecurityPermission]

}
