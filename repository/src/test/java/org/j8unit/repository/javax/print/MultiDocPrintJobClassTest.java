package org.j8unit.repository.javax.print;

import javax.print.MultiDocPrintJob;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class MultiDocPrintJobClassTest
implements org.j8unit.repository.javax.print.MultiDocPrintJobClassTests<MultiDocPrintJob> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.print.MultiDocPrintJob]

    @Override
    public Class<MultiDocPrintJob> createNewSUT() {
        return MultiDocPrintJob.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.print.MultiDocPrintJob]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.print.MultiDocPrintJob]

}
