package org.j8unit.repository.javax.security.auth.kerberos;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class KerberosPrincipalTest
implements org.j8unit.repository.javax.security.auth.kerberos.KerberosPrincipalTests<javax.security.auth.kerberos.KerberosPrincipal> {

    @Override
    public javax.security.auth.kerberos.KerberosPrincipal createNewSUT() {
        throw new AssumptionViolatedException("There is no default constructor for [javax.security.auth.kerberos.KerberosPrincipal] available.");
    }

}
