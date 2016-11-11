package org.j8unit.repository.org.w3c.dom.events;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.w3c.dom.events.UIEvent;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link UIEvent} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.org.w3c.dom.events.UIEventClassTests}).
 */

@RunWith(J8Unit4.class)
public class UIEventClassTest
implements UIEventClassTests<UIEvent> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.w3c.dom.events.UIEvent]

    @Override
    public Class<UIEvent> createNewSUT() {
        return UIEvent.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.w3c.dom.events.UIEvent]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.w3c.dom.events.UIEvent]

}
