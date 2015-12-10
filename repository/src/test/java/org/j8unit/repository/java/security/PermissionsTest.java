package org.j8unit.repository.java.security;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PermissionsTest
implements org.j8unit.repository.java.security.PermissionsTests<java.security.Permissions> {

    @Override
    public java.security.Permissions createNewSUT() {
        return new java.security.Permissions();
    }

}
