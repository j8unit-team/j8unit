package org.j8unit.repository.javax.print.attribute.standard;

import javax.print.attribute.standard.PrinterStateReason;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link PrinterStateReason} (by simply reusing
 * the J8Unit test interface {@link PrinterStateReasonClassTests}).
 */

@RunWith(J8Unit4.class)
public class PrinterStateReasonClassTest
implements PrinterStateReasonClassTests<PrinterStateReason> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.print.attribute.standard.PrinterStateReason]

    @Override
    public Class<PrinterStateReason> createNewSUT() {
        return PrinterStateReason.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.print.attribute.standard.PrinterStateReason]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.print.attribute.standard.PrinterStateReason]

}
