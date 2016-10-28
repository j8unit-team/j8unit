package org.j8unit.repository.javax.security.sasl;

import javax.security.sasl.SaslServer;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SaslServerClassTest
implements org.j8unit.repository.javax.security.sasl.SaslServerClassTests<SaslServer> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.security.sasl.SaslServer]

    @Override
    public Class<SaslServer> createNewSUT() {
        return SaslServer.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.security.sasl.SaslServer]

}
