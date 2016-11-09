package org.j8unit.repository.java.awt.print;

import java.awt.print.PrinterIOException;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link PrinterIOException} (by simply
 * reusing the J8Unit test interface {@link PrinterIOExceptionTests}).
 */

@RunWith(J8Unit4.class)
public class PrinterIOExceptionTest
implements PrinterIOExceptionTests<PrinterIOException> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.print.PrinterIOException]

    @Override
    public PrinterIOException createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.awt.print.PrinterIOException], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.awt.print.PrinterIOException]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.awt.print.PrinterIOException]

}
