package org.j8unit.repository.java.awt.event;

import java.awt.event.MouseWheelEvent;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link MouseWheelEvent} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.java.awt.event.MouseWheelEventTests}).
 */
@RunWith(J8Unit4.class)
public class MouseWheelEventTest
implements MouseWheelEventTests<MouseWheelEvent> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.event.MouseWheelEvent]

    @Override
    public MouseWheelEvent createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.awt.event.MouseWheelEvent], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.awt.event.MouseWheelEvent]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.awt.event.MouseWheelEvent]

}
