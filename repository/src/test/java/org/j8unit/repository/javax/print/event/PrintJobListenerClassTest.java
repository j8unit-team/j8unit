package org.j8unit.repository.javax.print.event;

import javax.print.event.PrintJobListener;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link PrintJobListener} (by simply reusing the
 * J8Unit test interface {@link PrintJobListenerClassTests}).
 */

@RunWith(J8Unit4.class)
public class PrintJobListenerClassTest
implements PrintJobListenerClassTests<PrintJobListener> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.print.event.PrintJobListener]

    @Override
    public Class<PrintJobListener> createNewSUT() {
        return PrintJobListener.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.print.event.PrintJobListener]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.print.event.PrintJobListener]

}
