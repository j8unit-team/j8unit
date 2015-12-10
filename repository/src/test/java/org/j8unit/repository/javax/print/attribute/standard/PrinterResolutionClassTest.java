package org.j8unit.repository.javax.print.attribute.standard;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PrinterResolutionClassTest
implements org.j8unit.repository.javax.print.attribute.standard.PrinterResolutionClassTests<javax.print.attribute.standard.PrinterResolution> {

    @Override
    public Class<javax.print.attribute.standard.PrinterResolution> createNewSUT() {
        return javax.print.attribute.standard.PrinterResolution.class;
    }

}
