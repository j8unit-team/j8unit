package org.j8unit.repository.javax.print.event;

import javax.print.event.PrintJobAttributeListener;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PrintJobAttributeListenerTest
implements org.j8unit.repository.javax.print.event.PrintJobAttributeListenerTests<PrintJobAttributeListener> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.print.event.PrintJobAttributeListener]

    @Override
    public PrintJobAttributeListener createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.print.event.PrintJobAttributeListener], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.print.event.PrintJobAttributeListener]

}
