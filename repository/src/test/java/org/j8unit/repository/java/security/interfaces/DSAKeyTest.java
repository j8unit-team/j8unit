package org.j8unit.repository.java.security.interfaces;

import java.security.interfaces.DSAKey;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link DSAKey} (by simply reusing the J8Unit
 * test interface {@link DSAKeyTests}).
 */

@RunWith(J8Unit4.class)
public class DSAKeyTest
implements DSAKeyTests<DSAKey> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.security.interfaces.DSAKey]

    @Override
    public DSAKey createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.security.interfaces.DSAKey], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.security.interfaces.DSAKey]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.security.interfaces.DSAKey]

}
