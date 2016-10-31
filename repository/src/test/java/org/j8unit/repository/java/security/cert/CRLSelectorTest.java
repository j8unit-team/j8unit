package org.j8unit.repository.java.security.cert;

import java.security.cert.CRLSelector;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CRLSelectorTest
implements org.j8unit.repository.java.security.cert.CRLSelectorTests<CRLSelector> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.security.cert.CRLSelector]

    @Override
    public CRLSelector createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.security.cert.CRLSelector], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.security.cert.CRLSelector]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.security.cert.CRLSelector]

}
