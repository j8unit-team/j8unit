package org.j8unit.repository.java.security;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class UnresolvedPermissionClassTest
implements org.j8unit.repository.java.security.UnresolvedPermissionClassTests<java.security.UnresolvedPermission> {

    @Override
    public Class<java.security.UnresolvedPermission> createNewSUT() {
        return java.security.UnresolvedPermission.class;
    }

}
