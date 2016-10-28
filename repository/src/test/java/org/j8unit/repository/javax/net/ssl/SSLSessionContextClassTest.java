package org.j8unit.repository.javax.net.ssl;

import javax.net.ssl.SSLSessionContext;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SSLSessionContextClassTest
implements org.j8unit.repository.javax.net.ssl.SSLSessionContextClassTests<SSLSessionContext> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.net.ssl.SSLSessionContext]

    @Override
    public Class<SSLSessionContext> createNewSUT() {
        return SSLSessionContext.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.net.ssl.SSLSessionContext]

}
