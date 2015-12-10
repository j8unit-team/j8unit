package org.j8unit.repository.javax.net.ssl;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SNIHostNameClassTest
implements org.j8unit.repository.javax.net.ssl.SNIHostNameClassTests<javax.net.ssl.SNIHostName> {

    @Override
    public Class<javax.net.ssl.SNIHostName> createNewSUT() {
        return javax.net.ssl.SNIHostName.class;
    }

}
