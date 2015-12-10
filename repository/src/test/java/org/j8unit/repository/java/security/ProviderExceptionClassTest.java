package org.j8unit.repository.java.security;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ProviderExceptionClassTest
implements org.j8unit.repository.java.security.ProviderExceptionClassTests<java.security.ProviderException> {

    @Override
    public Class<java.security.ProviderException> createNewSUT() {
        return java.security.ProviderException.class;
    }

}
