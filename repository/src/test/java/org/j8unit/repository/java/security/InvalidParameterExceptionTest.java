package org.j8unit.repository.java.security;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class InvalidParameterExceptionTest
implements org.j8unit.repository.java.security.InvalidParameterExceptionTests<java.security.InvalidParameterException> {

    @Override
    public java.security.InvalidParameterException createNewSUT() {
        return new java.security.InvalidParameterException();
    }

}
