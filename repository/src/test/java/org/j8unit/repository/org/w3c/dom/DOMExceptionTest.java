package org.j8unit.repository.org.w3c.dom;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.w3c.dom.DOMException;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link DOMException} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.org.w3c.dom.DOMExceptionTests}).
 */

@RunWith(J8Unit4.class)
public class DOMExceptionTest
implements DOMExceptionTests<DOMException> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.w3c.dom.DOMException]

    @Override
    public DOMException createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [org.w3c.dom.DOMException], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[org.w3c.dom.DOMException]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[org.w3c.dom.DOMException]

}
