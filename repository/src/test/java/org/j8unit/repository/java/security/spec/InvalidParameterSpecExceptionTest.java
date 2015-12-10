package org.j8unit.repository.java.security.spec;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class InvalidParameterSpecExceptionTest
implements org.j8unit.repository.java.security.spec.InvalidParameterSpecExceptionTests<java.security.spec.InvalidParameterSpecException> {

    @Override
    public java.security.spec.InvalidParameterSpecException createNewSUT() {
        return new java.security.spec.InvalidParameterSpecException();
    }

}
