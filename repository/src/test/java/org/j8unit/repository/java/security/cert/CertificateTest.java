package org.j8unit.repository.java.security.cert;

import java.security.cert.Certificate;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CertificateTest
implements org.j8unit.repository.java.security.cert.CertificateTests<Certificate> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.security.cert.Certificate]

    @Override
    public Certificate createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.security.cert.Certificate], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.security.cert.Certificate]

}
