package org.j8unit.repository.javax.print;

import javax.print.CancelablePrintJob;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CancelablePrintJobTest
implements org.j8unit.repository.javax.print.CancelablePrintJobTests<CancelablePrintJob> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.print.CancelablePrintJob]

    @Override
    public CancelablePrintJob createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.print.CancelablePrintJob], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.print.CancelablePrintJob]

}
