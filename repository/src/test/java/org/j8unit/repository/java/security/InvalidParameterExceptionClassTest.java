package org.j8unit.repository.java.security;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class InvalidParameterExceptionClassTest
implements org.j8unit.repository.java.security.InvalidParameterExceptionClassTests<java.security.InvalidParameterException> {

    @Override
    public Class<java.security.InvalidParameterException> createNewSUT() {
        return java.security.InvalidParameterException.class;
    }

}
