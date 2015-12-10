package org.j8unit.repository.javax.security.sasl;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SaslServerClassTest
implements org.j8unit.repository.javax.security.sasl.SaslServerClassTests<javax.security.sasl.SaslServer> {

    @Override
    public Class<javax.security.sasl.SaslServer> createNewSUT() {
        return javax.security.sasl.SaslServer.class;
    }

}
