package org.j8unit.repository.javax.security.auth.kerberos;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class KeyTabClassTest
implements org.j8unit.repository.javax.security.auth.kerberos.KeyTabClassTests<javax.security.auth.kerberos.KeyTab> {

    @Override
    public Class<javax.security.auth.kerberos.KeyTab> createNewSUT() {
        return javax.security.auth.kerberos.KeyTab.class;
    }

}
