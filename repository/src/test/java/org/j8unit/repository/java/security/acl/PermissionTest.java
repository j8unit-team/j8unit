package org.j8unit.repository.java.security.acl;

import java.security.acl.Permission;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link Permission} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.security.acl.PermissionTests}).
 */
@RunWith(J8Unit4.class)
public class PermissionTest
implements PermissionTests<Permission> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.security.acl.Permission]

    @Override
    public Permission createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.security.acl.Permission], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.security.acl.Permission]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.security.acl.Permission]

}
