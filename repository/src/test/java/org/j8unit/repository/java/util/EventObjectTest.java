package org.j8unit.repository.java.util;

import java.util.EventObject;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link EventObject} (by simply reusing the
 * J8Unit test interface {@link EventObjectTests}).
 */

@RunWith(J8Unit4.class)
public class EventObjectTest
implements EventObjectTests<EventObject> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.EventObject]

    @Override
    public EventObject createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.util.EventObject], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.util.EventObject]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.util.EventObject]

}
