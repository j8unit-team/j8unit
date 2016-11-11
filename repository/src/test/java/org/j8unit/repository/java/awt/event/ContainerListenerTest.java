package org.j8unit.repository.java.awt.event;

import java.awt.event.ContainerListener;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link ContainerListener} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.java.awt.event.ContainerListenerTests}).
 */

@RunWith(J8Unit4.class)
public class ContainerListenerTest
implements ContainerListenerTests<ContainerListener> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.event.ContainerListener]

    @Override
    public ContainerListener createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.awt.event.ContainerListener], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.awt.event.ContainerListener]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.awt.event.ContainerListener]

}
