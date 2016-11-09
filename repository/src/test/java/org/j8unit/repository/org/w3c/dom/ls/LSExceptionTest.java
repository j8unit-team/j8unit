package org.j8unit.repository.org.w3c.dom.ls;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.w3c.dom.ls.LSException;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link LSException} (by simply reusing the
 * J8Unit test interface {@link LSExceptionTests}).
 */

@RunWith(J8Unit4.class)
public class LSExceptionTest
implements LSExceptionTests<LSException> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.w3c.dom.ls.LSException]

    @Override
    public LSException createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [org.w3c.dom.ls.LSException], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[org.w3c.dom.ls.LSException]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[org.w3c.dom.ls.LSException]

}
