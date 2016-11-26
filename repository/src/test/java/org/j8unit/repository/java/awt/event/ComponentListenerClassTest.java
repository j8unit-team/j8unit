package org.j8unit.repository.java.awt.event;

import java.awt.event.ComponentListener;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link ComponentListener} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.awt.event.ComponentListenerClassTests}).
 */
@RunWith(J8Unit4.class)
public class ComponentListenerClassTest
implements ComponentListenerClassTests<ComponentListener> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.awt.event.ComponentListener]

    @Override
    public Class<ComponentListener> createNewSUT() {
        return ComponentListener.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.awt.event.ComponentListener]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.awt.event.ComponentListener]

}
