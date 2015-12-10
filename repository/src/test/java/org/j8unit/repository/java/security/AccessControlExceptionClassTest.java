package org.j8unit.repository.java.security;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AccessControlExceptionClassTest
implements org.j8unit.repository.java.security.AccessControlExceptionClassTests<java.security.AccessControlException> {

    @Override
    public Class<java.security.AccessControlException> createNewSUT() {
        return java.security.AccessControlException.class;
    }

}
