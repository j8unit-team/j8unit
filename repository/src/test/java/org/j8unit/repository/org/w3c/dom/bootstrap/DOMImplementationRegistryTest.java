package org.j8unit.repository.org.w3c.dom.bootstrap;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.w3c.dom.bootstrap.DOMImplementationRegistry;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link DOMImplementationRegistry} (by simply
 * reusing the J8Unit test interface
 * {@link org.j8unit.repository.org.w3c.dom.bootstrap.DOMImplementationRegistryTests}).
 */
@RunWith(J8Unit4.class)
public class DOMImplementationRegistryTest
implements DOMImplementationRegistryTests<DOMImplementationRegistry> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.w3c.dom.bootstrap.DOMImplementationRegistry]

    @Override
    public DOMImplementationRegistry createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [org.w3c.dom.bootstrap.DOMImplementationRegistry], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[org.w3c.dom.bootstrap.DOMImplementationRegistry]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[org.w3c.dom.bootstrap.DOMImplementationRegistry]

}
