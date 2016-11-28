package org.j8unit.repository.java.security.interfaces;

import java.security.interfaces.RSAKey;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link RSAKey} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.java.security.interfaces.RSAKeyTests}).
 */
@RunWith(J8Unit4.class)
public class RSAKeyTest
implements RSAKeyTests<RSAKey> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.security.interfaces.RSAKey]

    @Override
    public RSAKey createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.security.interfaces.RSAKey], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.security.interfaces.RSAKey]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.security.interfaces.RSAKey]

}
