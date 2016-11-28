package org.j8unit.repository.org.w3c.dom.ls;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.w3c.dom.ls.LSLoadEvent;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link LSLoadEvent} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.org.w3c.dom.ls.LSLoadEventClassTests}).
 */
@RunWith(J8Unit4.class)
public class LSLoadEventClassTest
implements LSLoadEventClassTests<LSLoadEvent> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.w3c.dom.ls.LSLoadEvent]

    @Override
    public Class<LSLoadEvent> createNewSUT() {
        return LSLoadEvent.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.w3c.dom.ls.LSLoadEvent]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.w3c.dom.ls.LSLoadEvent]

}
