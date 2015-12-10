package org.j8unit.repository.java.security.cert;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CertificateRevokedExceptionTest
implements org.j8unit.repository.java.security.cert.CertificateRevokedExceptionTests<java.security.cert.CertificateRevokedException> {

    @Override
    public java.security.cert.CertificateRevokedException createNewSUT() {
        throw new AssumptionViolatedException("There is no default constructor for [java.security.cert.CertificateRevokedException] available.");
    }

}
