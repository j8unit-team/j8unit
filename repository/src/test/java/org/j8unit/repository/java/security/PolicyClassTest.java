package org.j8unit.repository.java.security;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PolicyClassTest
implements org.j8unit.repository.java.security.PolicyClassTests<java.security.Policy> {

    @RunWith(J8Unit4.class)
    public static class ParametersClassTest
    implements org.j8unit.repository.java.security.PolicyClassTests.ParametersClassTests<java.security.Policy.Parameters> {

        @Override
        public Class<java.security.Policy.Parameters> createNewSUT() {
            return java.security.Policy.Parameters.class;
        }

    }

    @Override
    public Class<java.security.Policy> createNewSUT() {
        return java.security.Policy.class;
    }

}
