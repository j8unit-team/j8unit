package org.j8unit.repository.java.awt.print;

import java.awt.print.PrinterGraphics;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link PrinterGraphics} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.awt.print.PrinterGraphicsClassTests}).
 */
@RunWith(J8Unit4.class)
public class PrinterGraphicsClassTest
implements PrinterGraphicsClassTests<PrinterGraphics> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.awt.print.PrinterGraphics]

    @Override
    public Class<PrinterGraphics> createNewSUT() {
        return PrinterGraphics.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.awt.print.PrinterGraphics]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.awt.print.PrinterGraphics]

}
