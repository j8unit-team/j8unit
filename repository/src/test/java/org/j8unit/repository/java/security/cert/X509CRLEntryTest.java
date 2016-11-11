package org.j8unit.repository.java.security.cert;

import java.security.cert.X509CRLEntry;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link X509CRLEntry} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.security.cert.X509CRLEntryTests}).
 */

@RunWith(J8Unit4.class)
public class X509CRLEntryTest
implements X509CRLEntryTests<X509CRLEntry> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.security.cert.X509CRLEntry]

    @Override
    public X509CRLEntry createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.security.cert.X509CRLEntry], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.security.cert.X509CRLEntry]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.security.cert.X509CRLEntry]

}
