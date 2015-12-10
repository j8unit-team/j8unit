package org.j8unit.repository.java.security;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class NoSuchProviderExceptionTest
implements org.j8unit.repository.java.security.NoSuchProviderExceptionTests<java.security.NoSuchProviderException> {

    @Override
    public java.security.NoSuchProviderException createNewSUT() {
        return new java.security.NoSuchProviderException();
    }

}
