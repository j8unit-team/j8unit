package org.j8unit.repository.java.security.acl;

import java.security.acl.Permission;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PermissionClassTest
implements org.j8unit.repository.java.security.acl.PermissionClassTests<Permission> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.security.acl.Permission]

    @Override
    public Class<Permission> createNewSUT() {
        return Permission.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.security.acl.Permission]

}
