package org.j8unit.repository.org.w3c.dom.ls;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.w3c.dom.ls.LSProgressEvent;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link LSProgressEvent} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.org.w3c.dom.ls.LSProgressEventClassTests}).
 */

@RunWith(J8Unit4.class)
public class LSProgressEventClassTest
implements LSProgressEventClassTests<LSProgressEvent> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.w3c.dom.ls.LSProgressEvent]

    @Override
    public Class<LSProgressEvent> createNewSUT() {
        return LSProgressEvent.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.w3c.dom.ls.LSProgressEvent]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.w3c.dom.ls.LSProgressEvent]

}
