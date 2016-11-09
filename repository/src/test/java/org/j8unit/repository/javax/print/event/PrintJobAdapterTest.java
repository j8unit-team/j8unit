package org.j8unit.repository.javax.print.event;

import javax.print.event.PrintJobAdapter;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link PrintJobAdapter} (by simply reusing
 * the J8Unit test interface {@link PrintJobAdapterTests}).
 */

@RunWith(J8Unit4.class)
public class PrintJobAdapterTest
implements PrintJobAdapterTests<PrintJobAdapter> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.print.event.PrintJobAdapter]

    @Override
    public PrintJobAdapter createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.print.event.PrintJobAdapter], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.print.event.PrintJobAdapter]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.print.event.PrintJobAdapter]

}
