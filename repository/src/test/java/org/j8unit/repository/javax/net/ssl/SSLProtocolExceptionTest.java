package org.j8unit.repository.javax.net.ssl;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SSLProtocolExceptionTest
implements org.j8unit.repository.javax.net.ssl.SSLProtocolExceptionTests<javax.net.ssl.SSLProtocolException> {

    @Override
    public javax.net.ssl.SSLProtocolException createNewSUT() {
        throw new AssertionError("There is no default constructor for [javax.net.ssl.SSLProtocolException] available.");
    }

}
