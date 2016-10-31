package org.j8unit.repository.javax.security.auth.x500;

import javax.security.auth.x500.X500Principal;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class X500PrincipalTest
implements org.j8unit.repository.javax.security.auth.x500.X500PrincipalTests<X500Principal> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.security.auth.x500.X500Principal]

    @Override
    public X500Principal createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.security.auth.x500.X500Principal], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.security.auth.x500.X500Principal]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.security.auth.x500.X500Principal]

}
