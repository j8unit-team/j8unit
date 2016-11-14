package org.j8unit.repository.javax.print;

import javax.print.CancelablePrintJob;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link CancelablePrintJob} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.javax.print.CancelablePrintJobClassTests}).
 */

@RunWith(J8Unit4.class)
public class CancelablePrintJobClassTest
implements CancelablePrintJobClassTests<CancelablePrintJob> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.print.CancelablePrintJob]

    @Override
    public Class<CancelablePrintJob> createNewSUT() {
        return CancelablePrintJob.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.print.CancelablePrintJob]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.print.CancelablePrintJob]

}
