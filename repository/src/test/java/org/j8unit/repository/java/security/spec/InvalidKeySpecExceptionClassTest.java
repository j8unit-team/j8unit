package org.j8unit.repository.java.security.spec;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class InvalidKeySpecExceptionClassTest
implements org.j8unit.repository.java.security.spec.InvalidKeySpecExceptionClassTests<java.security.spec.InvalidKeySpecException> {

    @Override
    public Class<java.security.spec.InvalidKeySpecException> createNewSUT() {
        return java.security.spec.InvalidKeySpecException.class;
    }

}
