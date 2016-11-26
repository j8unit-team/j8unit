package org.j8unit.repository.java.security.cert;

import java.security.cert.Extension;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link Extension} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.java.security.cert.ExtensionClassTests}).
 */
@RunWith(J8Unit4.class)
public class ExtensionClassTest
implements ExtensionClassTests<Extension> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.security.cert.Extension]

    @Override
    public Class<Extension> createNewSUT() {
        return Extension.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.security.cert.Extension]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.security.cert.Extension]

}
