package org.j8unit.repository.javax.print.event;

import javax.print.event.PrintJobAttributeEvent;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link PrintJobAttributeEvent} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.javax.print.event.PrintJobAttributeEventTests}).
 */

@RunWith(J8Unit4.class)
public class PrintJobAttributeEventTest
implements PrintJobAttributeEventTests<PrintJobAttributeEvent> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.print.event.PrintJobAttributeEvent]

    @Override
    public PrintJobAttributeEvent createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.print.event.PrintJobAttributeEvent], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.print.event.PrintJobAttributeEvent]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.print.event.PrintJobAttributeEvent]

}
