package org.j8unit.repository.javax.print.event;

import javax.print.event.PrintJobListener;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link PrintJobListener} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.javax.print.event.PrintJobListenerTests}).
 */
@RunWith(J8Unit4.class)
public class PrintJobListenerTest
implements PrintJobListenerTests<PrintJobListener> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.print.event.PrintJobListener]

    @Override
    public PrintJobListener createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.print.event.PrintJobListener], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.print.event.PrintJobListener]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.print.event.PrintJobListener]

}
