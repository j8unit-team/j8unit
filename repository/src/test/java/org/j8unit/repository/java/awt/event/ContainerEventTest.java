package org.j8unit.repository.java.awt.event;

import java.awt.event.ContainerEvent;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link ContainerEvent} (by simply reusing
 * the J8Unit test interface {@link ContainerEventTests}).
 */

@RunWith(J8Unit4.class)
public class ContainerEventTest
implements ContainerEventTests<ContainerEvent> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.event.ContainerEvent]

    @Override
    public ContainerEvent createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.awt.event.ContainerEvent], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.awt.event.ContainerEvent]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.awt.event.ContainerEvent]

}
