package org.j8unit.repository.java.lang;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SecurityExceptionTest
implements org.j8unit.repository.java.lang.SecurityExceptionTests<java.lang.SecurityException> {

    @Override
    public java.lang.SecurityException createNewSUT() {
        return new java.lang.SecurityException();
    }

}
