package org.j8unit.repository.javax.annotation;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ResourceClassTest
implements org.j8unit.repository.javax.annotation.ResourceClassTests<javax.annotation.Resource> {

    @RunWith(J8Unit4.class)
    public static class AuthenticationTypeClassTest
    implements org.j8unit.repository.javax.annotation.ResourceClassTests.AuthenticationTypeClassTests<javax.annotation.Resource.AuthenticationType> {

        @Override
        public Class<javax.annotation.Resource.AuthenticationType> createNewSUT() {
            return javax.annotation.Resource.AuthenticationType.class;
        }

    }

    @Override
    public Class<javax.annotation.Resource> createNewSUT() {
        return javax.annotation.Resource.class;
    }

}
