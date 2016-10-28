package org.j8unit.repository.javax.net.ssl;

import javax.net.ssl.SSLEngine;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SSLEngineClassTest
implements org.j8unit.repository.javax.net.ssl.SSLEngineClassTests<SSLEngine> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.net.ssl.SSLEngine]

    @Override
    public Class<SSLEngine> createNewSUT() {
        return SSLEngine.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.net.ssl.SSLEngine]

}
