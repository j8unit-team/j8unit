package org.j8unit.repository.javax.security.auth.kerberos;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class KerberosPrincipalClassTest
implements org.j8unit.repository.javax.security.auth.kerberos.KerberosPrincipalClassTests<javax.security.auth.kerberos.KerberosPrincipal> {

    @Override
    public Class<javax.security.auth.kerberos.KerberosPrincipal> createNewSUT() {
        return javax.security.auth.kerberos.KerberosPrincipal.class;
    }

}
