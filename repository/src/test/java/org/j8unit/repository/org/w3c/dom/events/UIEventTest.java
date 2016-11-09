package org.j8unit.repository.org.w3c.dom.events;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.w3c.dom.events.UIEvent;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link UIEvent} (by simply reusing the
 * J8Unit test interface {@link UIEventTests}).
 */

@RunWith(J8Unit4.class)
public class UIEventTest
implements UIEventTests<UIEvent> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.w3c.dom.events.UIEvent]

    @Override
    public UIEvent createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [org.w3c.dom.events.UIEvent], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[org.w3c.dom.events.UIEvent]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[org.w3c.dom.events.UIEvent]

}
