package org.j8unit.repository.javax.net.ssl;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class KeyManagerFactorySpiClassTest
implements org.j8unit.repository.javax.net.ssl.KeyManagerFactorySpiClassTests<javax.net.ssl.KeyManagerFactorySpi> {

    @Override
    public Class<javax.net.ssl.KeyManagerFactorySpi> createNewSUT() {
        return javax.net.ssl.KeyManagerFactorySpi.class;
    }

}
