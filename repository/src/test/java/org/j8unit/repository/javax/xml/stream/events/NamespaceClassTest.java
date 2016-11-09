package org.j8unit.repository.javax.xml.stream.events;

import javax.xml.stream.events.Namespace;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link Namespace} (by simply reusing the J8Unit
 * test interface {@link NamespaceClassTests}).
 */

@RunWith(J8Unit4.class)
public class NamespaceClassTest
implements NamespaceClassTests<Namespace> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.stream.events.Namespace]

    @Override
    public Class<Namespace> createNewSUT() {
        return Namespace.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.xml.stream.events.Namespace]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.stream.events.Namespace]

}
