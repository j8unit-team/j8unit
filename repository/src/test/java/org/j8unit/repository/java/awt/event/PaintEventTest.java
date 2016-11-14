package org.j8unit.repository.java.awt.event;

import java.awt.event.PaintEvent;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link PaintEvent} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.awt.event.PaintEventTests}).
 */

@RunWith(J8Unit4.class)
public class PaintEventTest
implements PaintEventTests<PaintEvent> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.event.PaintEvent]

    @Override
    public PaintEvent createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.awt.event.PaintEvent], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.awt.event.PaintEvent]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.awt.event.PaintEvent]

}
