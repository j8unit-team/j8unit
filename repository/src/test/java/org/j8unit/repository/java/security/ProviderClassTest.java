package org.j8unit.repository.java.security;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ProviderClassTest
implements org.j8unit.repository.java.security.ProviderClassTests<java.security.Provider> {

    @Override
    public Class<java.security.Provider> createNewSUT() {
        return java.security.Provider.class;
    }

    @RunWith(J8Unit4.class)
    public static class ServiceClassTest
    implements org.j8unit.repository.java.security.ProviderClassTests.ServiceClassTests<java.security.Provider.Service> {

        @Override
        public Class<java.security.Provider.Service> createNewSUT() {
            return java.security.Provider.Service.class;
        }

    }

}
