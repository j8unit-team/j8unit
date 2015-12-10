package org.j8unit.repository.java.awt.print;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PrinterJobClassTest
implements org.j8unit.repository.java.awt.print.PrinterJobClassTests<java.awt.print.PrinterJob> {

    @Override
    public Class<java.awt.print.PrinterJob> createNewSUT() {
        return java.awt.print.PrinterJob.class;
    }

}
