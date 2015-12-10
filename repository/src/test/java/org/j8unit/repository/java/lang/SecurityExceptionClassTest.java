package org.j8unit.repository.java.lang;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SecurityExceptionClassTest
implements org.j8unit.repository.java.lang.SecurityExceptionClassTests<java.lang.SecurityException> {

    @Override
    public Class<java.lang.SecurityException> createNewSUT() {
        return java.lang.SecurityException.class;
    }

}
