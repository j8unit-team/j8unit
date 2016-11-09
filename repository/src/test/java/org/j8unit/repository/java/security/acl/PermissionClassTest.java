package org.j8unit.repository.java.security.acl;

import java.security.acl.Permission;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link Permission} (by simply reusing the J8Unit
 * test interface {@link PermissionClassTests}).
 */

@RunWith(J8Unit4.class)
public class PermissionClassTest
implements PermissionClassTests<Permission> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.security.acl.Permission]

    @Override
    public Class<Permission> createNewSUT() {
        return Permission.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.security.acl.Permission]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.security.acl.Permission]

}
