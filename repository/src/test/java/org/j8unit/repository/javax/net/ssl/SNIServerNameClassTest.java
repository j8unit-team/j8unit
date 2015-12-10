package org.j8unit.repository.javax.net.ssl;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SNIServerNameClassTest
implements org.j8unit.repository.javax.net.ssl.SNIServerNameClassTests<javax.net.ssl.SNIServerName> {

    @Override
    public Class<javax.net.ssl.SNIServerName> createNewSUT() {
        return javax.net.ssl.SNIServerName.class;
    }

}
