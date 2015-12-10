package org.j8unit.repository.javax.security.auth.x500;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class X500PrincipalClassTest
implements org.j8unit.repository.javax.security.auth.x500.X500PrincipalClassTests<javax.security.auth.x500.X500Principal> {

    @Override
    public Class<javax.security.auth.x500.X500Principal> createNewSUT() {
        return javax.security.auth.x500.X500Principal.class;
    }

}
