package org.j8unit.repository.java.security.cert;

import java.security.cert.Extension;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link Extension} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.security.cert.ExtensionTests}).
 */

@RunWith(J8Unit4.class)
public class ExtensionTest
implements ExtensionTests<Extension> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.security.cert.Extension]

    @Override
    public Extension createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.security.cert.Extension], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.security.cert.Extension]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.security.cert.Extension]

}
