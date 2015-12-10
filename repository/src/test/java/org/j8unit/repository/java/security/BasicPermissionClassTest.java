package org.j8unit.repository.java.security;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class BasicPermissionClassTest
implements org.j8unit.repository.java.security.BasicPermissionClassTests<java.security.BasicPermission> {

    @Override
    public Class<java.security.BasicPermission> createNewSUT() {
        return java.security.BasicPermission.class;
    }

}
