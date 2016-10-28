package org.j8unit.repository.javax.security.sasl;

import javax.security.sasl.SaslServerFactory;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SaslServerFactoryClassTest
implements org.j8unit.repository.javax.security.sasl.SaslServerFactoryClassTests<SaslServerFactory> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.security.sasl.SaslServerFactory]

    @Override
    public Class<SaslServerFactory> createNewSUT() {
        return SaslServerFactory.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.security.sasl.SaslServerFactory]

}
