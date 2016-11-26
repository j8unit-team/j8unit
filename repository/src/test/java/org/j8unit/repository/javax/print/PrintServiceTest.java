package org.j8unit.repository.javax.print;

import javax.print.PrintService;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link PrintService} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.print.PrintServiceTests}).
 */
@RunWith(J8Unit4.class)
public class PrintServiceTest
implements PrintServiceTests<PrintService> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.print.PrintService]

    @Override
    public PrintService createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.print.PrintService], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.print.PrintService]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.print.PrintService]

}
