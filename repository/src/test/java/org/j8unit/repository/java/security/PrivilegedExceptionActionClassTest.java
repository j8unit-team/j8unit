package org.j8unit.repository.java.security;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
@SuppressWarnings("rawtypes")
public class PrivilegedExceptionActionClassTest
implements org.j8unit.repository.java.security.PrivilegedExceptionActionClassTests<java.security.PrivilegedExceptionAction> {

    @Override
    public Class<java.security.PrivilegedExceptionAction> createNewSUT() {
        return java.security.PrivilegedExceptionAction.class;
    }

}
