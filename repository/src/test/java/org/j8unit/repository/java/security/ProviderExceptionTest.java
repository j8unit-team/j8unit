package org.j8unit.repository.java.security;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ProviderExceptionTest
implements org.j8unit.repository.java.security.ProviderExceptionTests<java.security.ProviderException> {

    @Override
    public java.security.ProviderException createNewSUT() {
        return new java.security.ProviderException();
    }

}
