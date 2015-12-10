package org.j8unit.repository.java.security.acl;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PermissionClassTest
implements org.j8unit.repository.java.security.acl.PermissionClassTests<java.security.acl.Permission> {

    @Override
    public Class<java.security.acl.Permission> createNewSUT() {
        return java.security.acl.Permission.class;
    }

}
