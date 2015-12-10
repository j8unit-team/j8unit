package org.j8unit.repository.javax.security.auth.kerberos;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class KerberosKeyClassTest
implements org.j8unit.repository.javax.security.auth.kerberos.KerberosKeyClassTests<javax.security.auth.kerberos.KerberosKey> {

    @Override
    public Class<javax.security.auth.kerberos.KerberosKey> createNewSUT() {
        return javax.security.auth.kerberos.KerberosKey.class;
    }

}
