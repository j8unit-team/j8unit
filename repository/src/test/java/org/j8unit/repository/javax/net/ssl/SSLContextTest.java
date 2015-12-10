package org.j8unit.repository.javax.net.ssl;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SSLContextTest
implements org.j8unit.repository.javax.net.ssl.SSLContextTests<javax.net.ssl.SSLContext> {

    @Override
    public javax.net.ssl.SSLContext createNewSUT() {
        throw new AssertionError("There is no default constructor for [javax.net.ssl.SSLContext] available.");
    }

}
