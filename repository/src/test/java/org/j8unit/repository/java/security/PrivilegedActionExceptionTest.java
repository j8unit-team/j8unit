package org.j8unit.repository.java.security;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PrivilegedActionExceptionTest
implements org.j8unit.repository.java.security.PrivilegedActionExceptionTests<java.security.PrivilegedActionException> {

    @Override
    public java.security.PrivilegedActionException createNewSUT() {
        throw new AssumptionViolatedException("There is no default constructor for [java.security.PrivilegedActionException] available.");
    }

}
