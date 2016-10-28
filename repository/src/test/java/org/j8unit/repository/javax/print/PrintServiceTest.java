package org.j8unit.repository.javax.print;

import javax.print.PrintService;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PrintServiceTest
implements org.j8unit.repository.javax.print.PrintServiceTests<PrintService> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.print.PrintService]

    @Override
    public PrintService createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.print.PrintService], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.print.PrintService]

}
