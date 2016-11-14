package org.j8unit.repository.javax.print;

import javax.print.MultiDocPrintJob;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link MultiDocPrintJob} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.print.MultiDocPrintJobClassTests}).
 */

@RunWith(J8Unit4.class)
public class MultiDocPrintJobClassTest
implements MultiDocPrintJobClassTests<MultiDocPrintJob> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.print.MultiDocPrintJob]

    @Override
    public Class<MultiDocPrintJob> createNewSUT() {
        return MultiDocPrintJob.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.print.MultiDocPrintJob]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.print.MultiDocPrintJob]

}
