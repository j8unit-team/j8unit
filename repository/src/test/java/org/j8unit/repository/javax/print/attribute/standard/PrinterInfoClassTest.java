package org.j8unit.repository.javax.print.attribute.standard;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PrinterInfoClassTest
implements org.j8unit.repository.javax.print.attribute.standard.PrinterInfoClassTests<javax.print.attribute.standard.PrinterInfo> {

    @Override
    public Class<javax.print.attribute.standard.PrinterInfo> createNewSUT() {
        return javax.print.attribute.standard.PrinterInfo.class;
    }

}
