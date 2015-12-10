package org.j8unit.repository.javax.print;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class MultiDocPrintServiceClassTest
implements org.j8unit.repository.javax.print.MultiDocPrintServiceClassTests<javax.print.MultiDocPrintService> {

    @Override
    public Class<javax.print.MultiDocPrintService> createNewSUT() {
        return javax.print.MultiDocPrintService.class;
    }

}
