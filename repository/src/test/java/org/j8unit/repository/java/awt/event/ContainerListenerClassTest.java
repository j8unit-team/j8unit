package org.j8unit.repository.java.awt.event;

import java.awt.event.ContainerListener;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link ContainerListener} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.awt.event.ContainerListenerClassTests}).
 */
@RunWith(J8Unit4.class)
public class ContainerListenerClassTest
implements ContainerListenerClassTests<ContainerListener> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.awt.event.ContainerListener]

    @Override
    public Class<ContainerListener> createNewSUT() {
        return ContainerListener.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.awt.event.ContainerListener]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.awt.event.ContainerListener]

}
