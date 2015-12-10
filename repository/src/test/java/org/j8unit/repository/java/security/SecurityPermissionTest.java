package org.j8unit.repository.java.security;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SecurityPermissionTest
implements org.j8unit.repository.java.security.SecurityPermissionTests<java.security.SecurityPermission> {

    @Override
    public java.security.SecurityPermission createNewSUT() {
        throw new AssumptionViolatedException("There is no default constructor for [java.security.SecurityPermission] available.");
    }

}
