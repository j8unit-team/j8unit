package org.j8unit.repository.javax.print;

import javax.print.StreamPrintService;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link StreamPrintService} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.javax.print.StreamPrintServiceTests}).
 */
@RunWith(J8Unit4.class)
public class StreamPrintServiceTest
implements StreamPrintServiceTests<StreamPrintService> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.print.StreamPrintService]

    @Override
    public StreamPrintService createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.print.StreamPrintService], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.print.StreamPrintService]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.print.StreamPrintService]

}
