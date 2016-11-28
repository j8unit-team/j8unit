package org.j8unit.repository.javax.xml.namespace;

import javax.xml.namespace.NamespaceContext;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link NamespaceContext} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.javax.xml.namespace.NamespaceContextTests}).
 */
@RunWith(J8Unit4.class)
public class NamespaceContextTest
implements NamespaceContextTests<NamespaceContext> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.namespace.NamespaceContext]

    @Override
    public NamespaceContext createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.xml.namespace.NamespaceContext], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.xml.namespace.NamespaceContext]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.xml.namespace.NamespaceContext]

}
