package org.j8unit.repository.javax.naming;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ServiceUnavailableExceptionTest
implements org.j8unit.repository.javax.naming.ServiceUnavailableExceptionTests<javax.naming.ServiceUnavailableException> {

    @Override
    public javax.naming.ServiceUnavailableException createNewSUT() {
        return new javax.naming.ServiceUnavailableException();
    }

}
