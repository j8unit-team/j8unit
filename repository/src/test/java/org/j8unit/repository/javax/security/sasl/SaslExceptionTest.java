package org.j8unit.repository.javax.security.sasl;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SaslExceptionTest
implements org.j8unit.repository.javax.security.sasl.SaslExceptionTests<javax.security.sasl.SaslException> {

    @Override
    public javax.security.sasl.SaslException createNewSUT() {
        return new javax.security.sasl.SaslException();
    }

}
