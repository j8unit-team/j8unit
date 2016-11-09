package org.j8unit.repository.javax.print;

import javax.print.DocPrintJob;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link DocPrintJob} (by simply reusing the
 * J8Unit test interface {@link DocPrintJobTests}).
 */

@RunWith(J8Unit4.class)
public class DocPrintJobTest
implements DocPrintJobTests<DocPrintJob> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.print.DocPrintJob]

    @Override
    public DocPrintJob createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.print.DocPrintJob], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.print.DocPrintJob]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.print.DocPrintJob]

}
