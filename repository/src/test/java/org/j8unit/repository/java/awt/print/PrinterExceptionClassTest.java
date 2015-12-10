package org.j8unit.repository.java.awt.print;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PrinterExceptionClassTest
implements org.j8unit.repository.java.awt.print.PrinterExceptionClassTests<java.awt.print.PrinterException> {

    @Override
    public Class<java.awt.print.PrinterException> createNewSUT() {
        return java.awt.print.PrinterException.class;
    }

}
