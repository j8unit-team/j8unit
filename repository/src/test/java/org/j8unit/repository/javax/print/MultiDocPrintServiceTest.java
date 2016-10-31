package org.j8unit.repository.javax.print;

import javax.print.MultiDocPrintService;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class MultiDocPrintServiceTest
implements org.j8unit.repository.javax.print.MultiDocPrintServiceTests<MultiDocPrintService> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.print.MultiDocPrintService]

    @Override
    public MultiDocPrintService createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.print.MultiDocPrintService], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.print.MultiDocPrintService]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.print.MultiDocPrintService]

}
