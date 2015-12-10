package org.j8unit.repository.javax.net.ssl;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SSLEngineClassTest
implements org.j8unit.repository.javax.net.ssl.SSLEngineClassTests<javax.net.ssl.SSLEngine> {

    @Override
    public Class<javax.net.ssl.SSLEngine> createNewSUT() {
        return javax.net.ssl.SSLEngine.class;
    }

}
