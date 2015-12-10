package org.j8unit.repository.javax.security.sasl;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SaslServerFactoryClassTest
implements org.j8unit.repository.javax.security.sasl.SaslServerFactoryClassTests<javax.security.sasl.SaslServerFactory> {

    @Override
    public Class<javax.security.sasl.SaslServerFactory> createNewSUT() {
        return javax.security.sasl.SaslServerFactory.class;
    }

}
