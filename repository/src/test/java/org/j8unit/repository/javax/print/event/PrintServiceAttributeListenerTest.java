package org.j8unit.repository.javax.print.event;

import javax.print.event.PrintServiceAttributeListener;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PrintServiceAttributeListenerTest
implements org.j8unit.repository.javax.print.event.PrintServiceAttributeListenerTests<PrintServiceAttributeListener> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.print.event.PrintServiceAttributeListener]

    @Override
    public PrintServiceAttributeListener createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.print.event.PrintServiceAttributeListener], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.print.event.PrintServiceAttributeListener]

}
