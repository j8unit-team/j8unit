package org.j8unit.repository.org.w3c.dom.ls;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.w3c.dom.ls.LSProgressEvent;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link LSProgressEvent} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.org.w3c.dom.ls.LSProgressEventTests}).
 */
@RunWith(J8Unit4.class)
public class LSProgressEventTest
implements LSProgressEventTests<LSProgressEvent> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.w3c.dom.ls.LSProgressEvent]

    @Override
    public LSProgressEvent createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [org.w3c.dom.ls.LSProgressEvent], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[org.w3c.dom.ls.LSProgressEvent]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[org.w3c.dom.ls.LSProgressEvent]

}
