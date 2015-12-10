package org.j8unit.repository.javax.security.sasl;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SaslClassTest
implements org.j8unit.repository.javax.security.sasl.SaslClassTests<javax.security.sasl.Sasl> {

    @Override
    public Class<javax.security.sasl.Sasl> createNewSUT() {
        return javax.security.sasl.Sasl.class;
    }

}
