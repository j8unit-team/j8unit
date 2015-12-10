package org.j8unit.repository.java.security;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PrivilegedActionExceptionClassTest
implements org.j8unit.repository.java.security.PrivilegedActionExceptionClassTests<java.security.PrivilegedActionException> {

    @Override
    public Class<java.security.PrivilegedActionException> createNewSUT() {
        return java.security.PrivilegedActionException.class;
    }

}
