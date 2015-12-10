package org.j8unit.repository.javax.print.attribute.standard;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PrinterStateClassTest
implements org.j8unit.repository.javax.print.attribute.standard.PrinterStateClassTests<javax.print.attribute.standard.PrinterState> {

    @Override
    public Class<javax.print.attribute.standard.PrinterState> createNewSUT() {
        return javax.print.attribute.standard.PrinterState.class;
    }

}
