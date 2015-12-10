package org.j8unit.repository.javax.net.ssl;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SSLExceptionTest
implements org.j8unit.repository.javax.net.ssl.SSLExceptionTests<javax.net.ssl.SSLException> {

    @Override
    public javax.net.ssl.SSLException createNewSUT() {
        throw new AssumptionViolatedException("There is no default constructor for [javax.net.ssl.SSLException] available.");
    }

}
