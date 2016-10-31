package org.j8unit.repository.java.security;

import java.security.ProtectionDomain;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ProtectionDomainTest
implements org.j8unit.repository.java.security.ProtectionDomainTests<ProtectionDomain> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.security.ProtectionDomain]

    @Override
    public ProtectionDomain createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.security.ProtectionDomain], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.security.ProtectionDomain]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.security.ProtectionDomain]

}
