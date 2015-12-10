package org.j8unit.repository.javax.security.sasl;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SaslClientClassTest
implements org.j8unit.repository.javax.security.sasl.SaslClientClassTests<javax.security.sasl.SaslClient> {

    @Override
    public Class<javax.security.sasl.SaslClient> createNewSUT() {
        return javax.security.sasl.SaslClient.class;
    }

}
