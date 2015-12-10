package org.j8unit.repository.javax.naming;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ServiceUnavailableExceptionClassTest
implements org.j8unit.repository.javax.naming.ServiceUnavailableExceptionClassTests<javax.naming.ServiceUnavailableException> {

    @Override
    public Class<javax.naming.ServiceUnavailableException> createNewSUT() {
        return javax.naming.ServiceUnavailableException.class;
    }

}
