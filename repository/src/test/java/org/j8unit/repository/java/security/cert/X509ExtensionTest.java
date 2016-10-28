package org.j8unit.repository.java.security.cert;

import java.security.cert.X509Extension;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class X509ExtensionTest
implements org.j8unit.repository.java.security.cert.X509ExtensionTests<X509Extension> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.security.cert.X509Extension]

    @Override
    public X509Extension createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.security.cert.X509Extension], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.security.cert.X509Extension]

}
