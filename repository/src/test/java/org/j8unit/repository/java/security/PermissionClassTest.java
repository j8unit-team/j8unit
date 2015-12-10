package org.j8unit.repository.java.security;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PermissionClassTest
implements org.j8unit.repository.java.security.PermissionClassTests<java.security.Permission> {

    @Override
    public Class<java.security.Permission> createNewSUT() {
        return java.security.Permission.class;
    }

}
