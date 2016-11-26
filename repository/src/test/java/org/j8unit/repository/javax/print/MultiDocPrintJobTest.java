package org.j8unit.repository.javax.print;

import javax.print.MultiDocPrintJob;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link MultiDocPrintJob} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.javax.print.MultiDocPrintJobTests}).
 */
@RunWith(J8Unit4.class)
public class MultiDocPrintJobTest
implements MultiDocPrintJobTests<MultiDocPrintJob> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.print.MultiDocPrintJob]

    @Override
    public MultiDocPrintJob createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.print.MultiDocPrintJob], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.print.MultiDocPrintJob]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.print.MultiDocPrintJob]

}
