package org.j8unit.repository.java.security;

import java.security.PolicySpi;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PolicySpiTest
implements org.j8unit.repository.java.security.PolicySpiTests<PolicySpi> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.security.PolicySpi]

    @Override
    public PolicySpi createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.security.PolicySpi], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.security.PolicySpi]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.security.PolicySpi]

}
