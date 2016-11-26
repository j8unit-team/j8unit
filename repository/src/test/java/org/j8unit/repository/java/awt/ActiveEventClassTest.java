package org.j8unit.repository.java.awt;

import java.awt.ActiveEvent;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link ActiveEvent} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.awt.ActiveEventClassTests}).
 */
@RunWith(J8Unit4.class)
public class ActiveEventClassTest
implements ActiveEventClassTests<ActiveEvent> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.awt.ActiveEvent]

    @Override
    public Class<ActiveEvent> createNewSUT() {
        return ActiveEvent.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.awt.ActiveEvent]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.awt.ActiveEvent]

}
