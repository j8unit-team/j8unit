package org.j8unit.repository.java.security.cert;

import java.security.cert.CertStoreParameters;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CertStoreParametersTest
implements org.j8unit.repository.java.security.cert.CertStoreParametersTests<CertStoreParameters> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.security.cert.CertStoreParameters]

    @Override
    public CertStoreParameters createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.security.cert.CertStoreParameters], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.security.cert.CertStoreParameters]

}
