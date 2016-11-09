package org.j8unit.repository.javax.naming;

import javax.naming.NamingSecurityException;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link NamingSecurityException} (by simply
 * reusing the J8Unit test interface {@link NamingSecurityExceptionTests}).
 */

@RunWith(J8Unit4.class)
public class NamingSecurityExceptionTest
implements NamingSecurityExceptionTests<NamingSecurityException> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.naming.NamingSecurityException]

    @Override
    public NamingSecurityException createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.naming.NamingSecurityException], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.naming.NamingSecurityException]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.naming.NamingSecurityException]

}
