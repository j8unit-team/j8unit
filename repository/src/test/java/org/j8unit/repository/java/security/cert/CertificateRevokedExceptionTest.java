package org.j8unit.repository.java.security.cert;

import java.security.cert.CertificateRevokedException;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CertificateRevokedExceptionTest
implements org.j8unit.repository.java.security.cert.CertificateRevokedExceptionTests<CertificateRevokedException> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.security.cert.CertificateRevokedException]

    @Override
    public CertificateRevokedException createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.security.cert.CertificateRevokedException], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.security.cert.CertificateRevokedException]

}
