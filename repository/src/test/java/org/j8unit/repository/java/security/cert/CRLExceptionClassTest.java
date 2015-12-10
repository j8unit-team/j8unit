package org.j8unit.repository.java.security.cert;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CRLExceptionClassTest
implements org.j8unit.repository.java.security.cert.CRLExceptionClassTests<java.security.cert.CRLException> {

    @Override
    public Class<java.security.cert.CRLException> createNewSUT() {
        return java.security.cert.CRLException.class;
    }

}
