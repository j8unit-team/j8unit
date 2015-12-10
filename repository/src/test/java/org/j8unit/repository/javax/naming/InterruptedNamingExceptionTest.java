package org.j8unit.repository.javax.naming;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class InterruptedNamingExceptionTest
implements org.j8unit.repository.javax.naming.InterruptedNamingExceptionTests<javax.naming.InterruptedNamingException> {

    @Override
    public javax.naming.InterruptedNamingException createNewSUT() {
        return new javax.naming.InterruptedNamingException();
    }

}
