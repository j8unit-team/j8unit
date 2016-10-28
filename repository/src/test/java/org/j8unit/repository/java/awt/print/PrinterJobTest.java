package org.j8unit.repository.java.awt.print;

import java.awt.print.PrinterJob;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PrinterJobTest
implements org.j8unit.repository.java.awt.print.PrinterJobTests<PrinterJob> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.print.PrinterJob]

    @Override
    public PrinterJob createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.awt.print.PrinterJob], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.print.PrinterJob]

}
