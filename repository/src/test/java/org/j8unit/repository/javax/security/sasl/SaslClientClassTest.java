package org.j8unit.repository.javax.security.sasl;

import javax.security.sasl.SaslClient;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SaslClientClassTest
implements org.j8unit.repository.javax.security.sasl.SaslClientClassTests<SaslClient> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.security.sasl.SaslClient]

    @Override
    public Class<SaslClient> createNewSUT() {
        return SaslClient.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.security.sasl.SaslClient]

}
