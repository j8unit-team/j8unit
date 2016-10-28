package org.j8unit.repository.javax.print.attribute.standard;

import javax.print.attribute.standard.PrinterState;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PrinterStateClassTest
implements org.j8unit.repository.javax.print.attribute.standard.PrinterStateClassTests<PrinterState> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.print.attribute.standard.PrinterState]

    @Override
    public Class<PrinterState> createNewSUT() {
        return PrinterState.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.print.attribute.standard.PrinterState]

}
