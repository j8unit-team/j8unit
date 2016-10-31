package org.j8unit.repository.java.security.acl;

import java.security.acl.Permission;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PermissionTest
implements org.j8unit.repository.java.security.acl.PermissionTests<Permission> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.security.acl.Permission]

    @Override
    public Permission createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.security.acl.Permission], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.security.acl.Permission]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.security.acl.Permission]

}
