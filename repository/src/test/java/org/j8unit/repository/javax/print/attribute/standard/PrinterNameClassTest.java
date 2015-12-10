package org.j8unit.repository.javax.print.attribute.standard;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PrinterNameClassTest
implements org.j8unit.repository.javax.print.attribute.standard.PrinterNameClassTests<javax.print.attribute.standard.PrinterName> {

    @Override
    public Class<javax.print.attribute.standard.PrinterName> createNewSUT() {
        return javax.print.attribute.standard.PrinterName.class;
    }

}
