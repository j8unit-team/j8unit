package org.j8unit.repository.javax.net.ssl;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class KeyManagerFactoryClassTest
implements org.j8unit.repository.javax.net.ssl.KeyManagerFactoryClassTests<javax.net.ssl.KeyManagerFactory> {

    @Override
    public Class<javax.net.ssl.KeyManagerFactory> createNewSUT() {
        return javax.net.ssl.KeyManagerFactory.class;
    }

}
