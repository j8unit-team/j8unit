package org.j8unit.repository.java.security;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
@SuppressWarnings("rawtypes")
public class PrivilegedActionClassTest
implements org.j8unit.repository.java.security.PrivilegedActionClassTests<java.security.PrivilegedAction> {

    @Override
    public Class<java.security.PrivilegedAction> createNewSUT() {
        return java.security.PrivilegedAction.class;
    }

}
