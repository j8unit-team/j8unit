package org.j8unit.repository.javax.print;

import javax.print.DocPrintJob;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link DocPrintJob} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.print.DocPrintJobClassTests}).
 */

@RunWith(J8Unit4.class)
public class DocPrintJobClassTest
implements DocPrintJobClassTests<DocPrintJob> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.print.DocPrintJob]

    @Override
    public Class<DocPrintJob> createNewSUT() {
        return DocPrintJob.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.print.DocPrintJob]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.print.DocPrintJob]

}
