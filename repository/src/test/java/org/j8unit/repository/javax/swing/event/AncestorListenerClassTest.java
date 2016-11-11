package org.j8unit.repository.javax.swing.event;

import javax.swing.event.AncestorListener;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link AncestorListener} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.swing.event.AncestorListenerClassTests}).
 */

@RunWith(J8Unit4.class)
public class AncestorListenerClassTest
implements AncestorListenerClassTests<AncestorListener> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.event.AncestorListener]

    @Override
    public Class<AncestorListener> createNewSUT() {
        return AncestorListener.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.event.AncestorListener]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.event.AncestorListener]

}
