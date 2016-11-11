package org.j8unit.repository.javax.print;

import javax.print.CancelablePrintJob;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link CancelablePrintJob} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.javax.print.CancelablePrintJobTests}).
 */

@RunWith(J8Unit4.class)
public class CancelablePrintJobTest
implements CancelablePrintJobTests<CancelablePrintJob> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.print.CancelablePrintJob]

    @Override
    public CancelablePrintJob createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.print.CancelablePrintJob], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.print.CancelablePrintJob]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.print.CancelablePrintJob]

}
