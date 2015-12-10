package org.j8unit.repository.java.security.spec;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class InvalidParameterSpecExceptionClassTest
implements org.j8unit.repository.java.security.spec.InvalidParameterSpecExceptionClassTests<java.security.spec.InvalidParameterSpecException> {

    @Override
    public Class<java.security.spec.InvalidParameterSpecException> createNewSUT() {
        return java.security.spec.InvalidParameterSpecException.class;
    }

}
