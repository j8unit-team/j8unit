package org.j8unit.repository.java.awt.event;

import java.awt.event.InputEvent;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link InputEvent} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.awt.event.InputEventTests}).
 */

@RunWith(J8Unit4.class)
public class InputEventTest
implements InputEventTests<InputEvent> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.event.InputEvent]

    @Override
    public InputEvent createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.awt.event.InputEvent], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.awt.event.InputEvent]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.awt.event.InputEvent]

}
