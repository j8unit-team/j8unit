package org.j8unit.repository.javax.net.ssl;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SSLSessionContextClassTest
implements org.j8unit.repository.javax.net.ssl.SSLSessionContextClassTests<javax.net.ssl.SSLSessionContext> {

    @Override
    public Class<javax.net.ssl.SSLSessionContext> createNewSUT() {
        return javax.net.ssl.SSLSessionContext.class;
    }

}
