package org.j8unit.repository.javax.print.attribute.standard;

import javax.print.attribute.standard.PrinterIsAcceptingJobs;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link PrinterIsAcceptingJobs} (by simply
 * reusing the J8Unit test interface {@link PrinterIsAcceptingJobsClassTests}).
 */

@RunWith(J8Unit4.class)
public class PrinterIsAcceptingJobsClassTest
implements PrinterIsAcceptingJobsClassTests<PrinterIsAcceptingJobs> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.print.attribute.standard.PrinterIsAcceptingJobs]

    @Override
    public Class<PrinterIsAcceptingJobs> createNewSUT() {
        return PrinterIsAcceptingJobs.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.print.attribute.standard.PrinterIsAcceptingJobs]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.print.attribute.standard.PrinterIsAcceptingJobs]

}
