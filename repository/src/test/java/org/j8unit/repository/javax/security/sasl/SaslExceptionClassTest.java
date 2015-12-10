package org.j8unit.repository.javax.security.sasl;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SaslExceptionClassTest
implements org.j8unit.repository.javax.security.sasl.SaslExceptionClassTests<javax.security.sasl.SaslException> {

    @Override
    public Class<javax.security.sasl.SaslException> createNewSUT() {
        return javax.security.sasl.SaslException.class;
    }

}
