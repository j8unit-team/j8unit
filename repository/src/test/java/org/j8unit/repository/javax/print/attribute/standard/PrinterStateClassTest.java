package org.j8unit.repository.javax.print.attribute.standard;

import javax.print.attribute.standard.PrinterState;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link PrinterState} (by simply reusing the
 * J8Unit test interface {@link PrinterStateClassTests}).
 */

@RunWith(J8Unit4.class)
public class PrinterStateClassTest
implements PrinterStateClassTests<PrinterState> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.print.attribute.standard.PrinterState]

    @Override
    public Class<PrinterState> createNewSUT() {
        return PrinterState.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.print.attribute.standard.PrinterState]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.print.attribute.standard.PrinterState]

}
