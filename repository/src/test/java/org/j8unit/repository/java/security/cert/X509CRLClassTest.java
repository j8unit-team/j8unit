package org.j8unit.repository.java.security.cert;

import java.security.cert.X509CRL;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link X509CRL} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.java.security.cert.X509CRLClassTests}).
 */
@RunWith(J8Unit4.class)
public class X509CRLClassTest
implements X509CRLClassTests<X509CRL> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.security.cert.X509CRL]

    @Override
    public Class<X509CRL> createNewSUT() {
        return X509CRL.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.security.cert.X509CRL]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.security.cert.X509CRL]

}
