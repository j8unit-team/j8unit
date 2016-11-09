package org.j8unit.repository.javax.xml.namespace;

import javax.xml.namespace.NamespaceContext;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link NamespaceContext} (by simply reusing the
 * J8Unit test interface {@link NamespaceContextClassTests}).
 */

@RunWith(J8Unit4.class)
public class NamespaceContextClassTest
implements NamespaceContextClassTests<NamespaceContext> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.namespace.NamespaceContext]

    @Override
    public Class<NamespaceContext> createNewSUT() {
        return NamespaceContext.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.xml.namespace.NamespaceContext]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.namespace.NamespaceContext]

}
