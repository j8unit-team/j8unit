package org.j8unit.repository.javax.net.ssl;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SSLExceptionClassTest
implements org.j8unit.repository.javax.net.ssl.SSLExceptionClassTests<javax.net.ssl.SSLException> {

    @Override
    public Class<javax.net.ssl.SSLException> createNewSUT() {
        return javax.net.ssl.SSLException.class;
    }

}
