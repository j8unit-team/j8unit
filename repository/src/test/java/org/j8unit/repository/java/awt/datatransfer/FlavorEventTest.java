package org.j8unit.repository.java.awt.datatransfer;

import java.awt.datatransfer.FlavorEvent;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link FlavorEvent} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.awt.datatransfer.FlavorEventTests}).
 */
@RunWith(J8Unit4.class)
public class FlavorEventTest
implements FlavorEventTests<FlavorEvent> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.datatransfer.FlavorEvent]

    @Override
    public FlavorEvent createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.awt.datatransfer.FlavorEvent], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.awt.datatransfer.FlavorEvent]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.awt.datatransfer.FlavorEvent]

}
