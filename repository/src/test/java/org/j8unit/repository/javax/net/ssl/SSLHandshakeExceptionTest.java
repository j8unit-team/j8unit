package org.j8unit.repository.javax.net.ssl;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SSLHandshakeExceptionTest
implements org.j8unit.repository.javax.net.ssl.SSLHandshakeExceptionTests<javax.net.ssl.SSLHandshakeException> {

    @Override
    public javax.net.ssl.SSLHandshakeException createNewSUT() {
        throw new AssumptionViolatedException("There is no default constructor for [javax.net.ssl.SSLHandshakeException] available.");
    }

}
