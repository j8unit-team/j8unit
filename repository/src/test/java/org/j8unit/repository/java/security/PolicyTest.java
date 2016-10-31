package org.j8unit.repository.java.security;

import java.security.Policy;
import java.security.Policy.Parameters;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PolicyTest
implements org.j8unit.repository.java.security.PolicyTests<Policy> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.security.Policy]

    @Override
    public Policy createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.security.Policy], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.security.Policy]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.security.Policy]

    @RunWith(J8Unit4.class)
    public static class ParametersTest
    implements org.j8unit.repository.java.security.PolicyTests.ParametersTests<Parameters> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.security.Policy$Parameters]

        @Override
        public Parameters createNewSUT() {
            throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.security.Policy.Parameters], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.security.Policy$Parameters]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[java.security.Policy$Parameters]

    }

}
