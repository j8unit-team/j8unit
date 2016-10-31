package org.j8unit.repository.java.security;

import java.security.IdentityScope;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class IdentityScopeTest
implements org.j8unit.repository.java.security.IdentityScopeTests<IdentityScope> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.security.IdentityScope]

    @Override
    public IdentityScope createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.security.IdentityScope], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.security.IdentityScope]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.security.IdentityScope]

}
