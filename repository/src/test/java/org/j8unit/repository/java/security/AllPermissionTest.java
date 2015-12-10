package org.j8unit.repository.java.security;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AllPermissionTest
implements org.j8unit.repository.java.security.AllPermissionTests<java.security.AllPermission> {

    @Override
    public java.security.AllPermission createNewSUT() {
        return new java.security.AllPermission();
    }

}
