package org.j8unit.repository.javax.naming;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class NamingSecurityExceptionClassTest
implements org.j8unit.repository.javax.naming.NamingSecurityExceptionClassTests<javax.naming.NamingSecurityException> {

    @Override
    public Class<javax.naming.NamingSecurityException> createNewSUT() {
        return javax.naming.NamingSecurityException.class;
    }

}
