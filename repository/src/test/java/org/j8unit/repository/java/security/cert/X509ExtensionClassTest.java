package org.j8unit.repository.java.security.cert;

import java.security.cert.X509Extension;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link X509Extension} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.security.cert.X509ExtensionClassTests}).
 */
@RunWith(J8Unit4.class)
public class X509ExtensionClassTest
implements X509ExtensionClassTests<X509Extension> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.security.cert.X509Extension]

    @Override
    public Class<X509Extension> createNewSUT() {
        return X509Extension.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.security.cert.X509Extension]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.security.cert.X509Extension]

}
