package org.j8unit.repository.java.security;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PermissionsClassTest
implements org.j8unit.repository.java.security.PermissionsClassTests<java.security.Permissions> {

    @Override
    public Class<java.security.Permissions> createNewSUT() {
        return java.security.Permissions.class;
    }

}
