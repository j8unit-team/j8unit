package org.j8unit.repository.java.security;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AccessControlExceptionTest
implements org.j8unit.repository.java.security.AccessControlExceptionTests<java.security.AccessControlException> {

    @Override
    public java.security.AccessControlException createNewSUT() {
        throw new AssumptionViolatedException("There is no default constructor for [java.security.AccessControlException] available.");
    }

}
