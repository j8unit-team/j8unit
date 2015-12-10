package org.j8unit.repository.javax.security.sasl;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SaslClientFactoryClassTest
implements org.j8unit.repository.javax.security.sasl.SaslClientFactoryClassTests<javax.security.sasl.SaslClientFactory> {

    @Override
    public Class<javax.security.sasl.SaslClientFactory> createNewSUT() {
        return javax.security.sasl.SaslClientFactory.class;
    }

}
