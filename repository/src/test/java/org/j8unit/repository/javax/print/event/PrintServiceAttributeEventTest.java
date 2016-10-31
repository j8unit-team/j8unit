package org.j8unit.repository.javax.print.event;

import javax.print.event.PrintServiceAttributeEvent;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PrintServiceAttributeEventTest
implements org.j8unit.repository.javax.print.event.PrintServiceAttributeEventTests<PrintServiceAttributeEvent> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.print.event.PrintServiceAttributeEvent]

    @Override
    public PrintServiceAttributeEvent createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.print.event.PrintServiceAttributeEvent], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.print.event.PrintServiceAttributeEvent]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.print.event.PrintServiceAttributeEvent]

}
