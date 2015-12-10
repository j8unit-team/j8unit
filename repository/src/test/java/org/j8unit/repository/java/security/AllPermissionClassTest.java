package org.j8unit.repository.java.security;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AllPermissionClassTest
implements org.j8unit.repository.java.security.AllPermissionClassTests<java.security.AllPermission> {

    @Override
    public Class<java.security.AllPermission> createNewSUT() {
        return java.security.AllPermission.class;
    }

}
