package org.j8unit.repository.javax.net.ssl;

import javax.net.ssl.X509ExtendedTrustManager;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link X509ExtendedTrustManager} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.javax.net.ssl.X509ExtendedTrustManagerTests}).
 */
@RunWith(J8Unit4.class)
public class X509ExtendedTrustManagerTest
implements X509ExtendedTrustManagerTests<X509ExtendedTrustManager> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.net.ssl.X509ExtendedTrustManager]

    @Override
    public X509ExtendedTrustManager createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.net.ssl.X509ExtendedTrustManager], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.net.ssl.X509ExtendedTrustManager]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.net.ssl.X509ExtendedTrustManager]

}
