package org.j8unit.repository.javax.print;

import javax.print.StreamPrintService;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link StreamPrintService} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.javax.print.StreamPrintServiceClassTests}).
 */
@RunWith(J8Unit4.class)
public class StreamPrintServiceClassTest
implements StreamPrintServiceClassTests<StreamPrintService> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.print.StreamPrintService]

    @Override
    public Class<StreamPrintService> createNewSUT() {
        return StreamPrintService.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.print.StreamPrintService]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.print.StreamPrintService]

}
