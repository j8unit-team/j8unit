package org.j8unit.repository.java.security;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class NoSuchProviderExceptionClassTest
implements org.j8unit.repository.java.security.NoSuchProviderExceptionClassTests<java.security.NoSuchProviderException> {

    @Override
    public Class<java.security.NoSuchProviderException> createNewSUT() {
        return java.security.NoSuchProviderException.class;
    }

}
