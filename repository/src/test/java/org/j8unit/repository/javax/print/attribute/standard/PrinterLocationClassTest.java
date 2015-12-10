package org.j8unit.repository.javax.print.attribute.standard;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PrinterLocationClassTest
implements org.j8unit.repository.javax.print.attribute.standard.PrinterLocationClassTests<javax.print.attribute.standard.PrinterLocation> {

    @Override
    public Class<javax.print.attribute.standard.PrinterLocation> createNewSUT() {
        return javax.print.attribute.standard.PrinterLocation.class;
    }

}
