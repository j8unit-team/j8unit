package org.j8unit.repository.javax.security.auth.login;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ConfigurationSpiClassTest
implements org.j8unit.repository.javax.security.auth.login.ConfigurationSpiClassTests<javax.security.auth.login.ConfigurationSpi> {

    @Override
    public Class<javax.security.auth.login.ConfigurationSpi> createNewSUT() {
        return javax.security.auth.login.ConfigurationSpi.class;
    }

}
