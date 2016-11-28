package org.j8unit.repository.org.ietf.jgss;

import org.ietf.jgss.GSSException;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link GSSException} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.org.ietf.jgss.GSSExceptionTests}).
 */
@RunWith(J8Unit4.class)
public class GSSExceptionTest
implements GSSExceptionTests<GSSException> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.ietf.jgss.GSSException]

    @Override
    public GSSException createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [org.ietf.jgss.GSSException], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[org.ietf.jgss.GSSException]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[org.ietf.jgss.GSSException]

}
