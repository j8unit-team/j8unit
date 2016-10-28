package org.j8unit.repository.javax.print;

import javax.print.MultiDocPrintJob;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class MultiDocPrintJobTest
implements org.j8unit.repository.javax.print.MultiDocPrintJobTests<MultiDocPrintJob> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.print.MultiDocPrintJob]

    @Override
    public MultiDocPrintJob createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.print.MultiDocPrintJob], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.print.MultiDocPrintJob]

}
