package org.j8unit.repository.javax.net.ssl;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SSLKeyExceptionTest
implements org.j8unit.repository.javax.net.ssl.SSLKeyExceptionTests<javax.net.ssl.SSLKeyException> {

    @Override
    public javax.net.ssl.SSLKeyException createNewSUT() {
        throw new AssumptionViolatedException("There is no default constructor for [javax.net.ssl.SSLKeyException] available.");
    }

}
