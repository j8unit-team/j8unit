package org.j8unit.repository.javax.naming;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class NamingExceptionTest
implements org.j8unit.repository.javax.naming.NamingExceptionTests<javax.naming.NamingException> {

    @Override
    public javax.naming.NamingException createNewSUT() {
        return new javax.naming.NamingException();
    }

}
