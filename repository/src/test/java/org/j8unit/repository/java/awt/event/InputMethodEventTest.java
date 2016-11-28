package org.j8unit.repository.java.awt.event;

import java.awt.event.InputMethodEvent;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link InputMethodEvent} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.java.awt.event.InputMethodEventTests}).
 */
@RunWith(J8Unit4.class)
public class InputMethodEventTest
implements InputMethodEventTests<InputMethodEvent> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.event.InputMethodEvent]

    @Override
    public InputMethodEvent createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.awt.event.InputMethodEvent], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.awt.event.InputMethodEvent]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.awt.event.InputMethodEvent]

}
