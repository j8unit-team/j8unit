package org.j8unit.repository.java.awt.print;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PrinterExceptionTest
implements org.j8unit.repository.java.awt.print.PrinterExceptionTests<java.awt.print.PrinterException> {

    @Override
    public java.awt.print.PrinterException createNewSUT() {
        return new java.awt.print.PrinterException();
    }

}
