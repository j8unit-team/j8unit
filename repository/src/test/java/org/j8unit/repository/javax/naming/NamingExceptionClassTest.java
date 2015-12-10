package org.j8unit.repository.javax.naming;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class NamingExceptionClassTest
implements org.j8unit.repository.javax.naming.NamingExceptionClassTests<javax.naming.NamingException> {

    @Override
    public Class<javax.naming.NamingException> createNewSUT() {
        return javax.naming.NamingException.class;
    }

}
