package org.j8unit.repository.java.security;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AccessControlContextClassTest
implements org.j8unit.repository.java.security.AccessControlContextClassTests<java.security.AccessControlContext> {

    @Override
    public Class<java.security.AccessControlContext> createNewSUT() {
        return java.security.AccessControlContext.class;
    }

}
