package org.j8unit.repository.javax.print;

import javax.print.MultiDocPrintService;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link MultiDocPrintService} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.javax.print.MultiDocPrintServiceTests}).
 */

@RunWith(J8Unit4.class)
public class MultiDocPrintServiceTest
implements MultiDocPrintServiceTests<MultiDocPrintService> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.print.MultiDocPrintService]

    @Override
    public MultiDocPrintService createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.print.MultiDocPrintService], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.print.MultiDocPrintService]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.print.MultiDocPrintService]

}
