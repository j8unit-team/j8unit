package org.j8unit.repository.java.awt.event;

import java.awt.event.ActionEvent;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link ActionEvent} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.awt.event.ActionEventTests}).
 */
@RunWith(J8Unit4.class)
public class ActionEventTest
implements ActionEventTests<ActionEvent> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.event.ActionEvent]

    @Override
    public ActionEvent createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.awt.event.ActionEvent], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.awt.event.ActionEvent]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.awt.event.ActionEvent]

}
