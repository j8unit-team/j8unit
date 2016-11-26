package org.j8unit.repository.java.awt.print;

import java.awt.print.PrinterGraphics;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link PrinterGraphics} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.java.awt.print.PrinterGraphicsTests}).
 */
@RunWith(J8Unit4.class)
public class PrinterGraphicsTest
implements PrinterGraphicsTests<PrinterGraphics> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.print.PrinterGraphics]

    @Override
    public PrinterGraphics createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.awt.print.PrinterGraphics], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.awt.print.PrinterGraphics]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.awt.print.PrinterGraphics]

}
