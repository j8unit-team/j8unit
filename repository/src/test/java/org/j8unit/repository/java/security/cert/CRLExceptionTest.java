package org.j8unit.repository.java.security.cert;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CRLExceptionTest
implements org.j8unit.repository.java.security.cert.CRLExceptionTests<java.security.cert.CRLException> {

    @Override
    public java.security.cert.CRLException createNewSUT() {
        return new java.security.cert.CRLException();
    }

}