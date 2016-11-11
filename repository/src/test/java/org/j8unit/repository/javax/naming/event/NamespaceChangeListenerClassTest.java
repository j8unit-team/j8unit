package org.j8unit.repository.javax.naming.event;

import javax.naming.event.NamespaceChangeListener;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link NamespaceChangeListener} (by simply
 * reusing the J8Unit test interface
 * {@link org.j8unit.repository.javax.naming.event.NamespaceChangeListenerClassTests}).
 */

@RunWith(J8Unit4.class)
public class NamespaceChangeListenerClassTest
implements NamespaceChangeListenerClassTests<NamespaceChangeListener> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.naming.event.NamespaceChangeListener]

    @Override
    public Class<NamespaceChangeListener> createNewSUT() {
        return NamespaceChangeListener.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.naming.event.NamespaceChangeListener]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.naming.event.NamespaceChangeListener]

}
