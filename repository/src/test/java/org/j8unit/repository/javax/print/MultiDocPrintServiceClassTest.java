package org.j8unit.repository.javax.print;

import javax.print.MultiDocPrintService;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link MultiDocPrintService} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.javax.print.MultiDocPrintServiceClassTests}).
 */

@RunWith(J8Unit4.class)
public class MultiDocPrintServiceClassTest
implements MultiDocPrintServiceClassTests<MultiDocPrintService> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.print.MultiDocPrintService]

    @Override
    public Class<MultiDocPrintService> createNewSUT() {
        return MultiDocPrintService.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.print.MultiDocPrintService]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.print.MultiDocPrintService]

}
