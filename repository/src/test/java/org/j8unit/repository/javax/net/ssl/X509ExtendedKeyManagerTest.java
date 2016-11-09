package org.j8unit.repository.javax.net.ssl;

import javax.net.ssl.X509ExtendedKeyManager;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link X509ExtendedKeyManager} (by simply
 * reusing the J8Unit test interface {@link X509ExtendedKeyManagerTests}).
 */

@RunWith(J8Unit4.class)
public class X509ExtendedKeyManagerTest
implements X509ExtendedKeyManagerTests<X509ExtendedKeyManager> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.net.ssl.X509ExtendedKeyManager]

    @Override
    public X509ExtendedKeyManager createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.net.ssl.X509ExtendedKeyManager], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.net.ssl.X509ExtendedKeyManager]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.net.ssl.X509ExtendedKeyManager]

}
