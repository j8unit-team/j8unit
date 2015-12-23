package org.j8unit.repository.java.net;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AuthenticatorClassTest
implements org.j8unit.repository.java.net.AuthenticatorClassTests<java.net.Authenticator> {

    @Override
    public Class<java.net.Authenticator> createNewSUT() {
        return java.net.Authenticator.class;
    }

    @RunWith(J8Unit4.class)
    public static class RequestorTypeClassTest
    implements org.j8unit.repository.java.net.AuthenticatorClassTests.RequestorTypeClassTests<java.net.Authenticator.RequestorType> {

        @Override
        public Class<java.net.Authenticator.RequestorType> createNewSUT() {
            return java.net.Authenticator.RequestorType.class;
        }

    }

}
