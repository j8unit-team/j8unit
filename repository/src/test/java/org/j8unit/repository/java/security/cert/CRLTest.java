package org.j8unit.repository.java.security.cert;

import java.security.cert.CRL;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CRLTest
implements org.j8unit.repository.java.security.cert.CRLTests<CRL> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.security.cert.CRL]

    @Override
    public CRL createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.security.cert.CRL], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.security.cert.CRL]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.security.cert.CRL]

}
