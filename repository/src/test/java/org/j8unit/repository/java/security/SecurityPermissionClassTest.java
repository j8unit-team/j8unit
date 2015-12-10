package org.j8unit.repository.java.security;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SecurityPermissionClassTest
implements org.j8unit.repository.java.security.SecurityPermissionClassTests<java.security.SecurityPermission> {

    @Override
    public Class<java.security.SecurityPermission> createNewSUT() {
        return java.security.SecurityPermission.class;
    }

}
