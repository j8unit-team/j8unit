package org.j8unit.repository.javax.print.event;

import javax.print.event.PrintJobAttributeListener;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link PrintJobAttributeListener} (by simply
 * reusing the J8Unit test interface
 * {@link org.j8unit.repository.javax.print.event.PrintJobAttributeListenerClassTests}).
 */

@RunWith(J8Unit4.class)
public class PrintJobAttributeListenerClassTest
implements PrintJobAttributeListenerClassTests<PrintJobAttributeListener> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.print.event.PrintJobAttributeListener]

    @Override
    public Class<PrintJobAttributeListener> createNewSUT() {
        return PrintJobAttributeListener.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.print.event.PrintJobAttributeListener]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.print.event.PrintJobAttributeListener]

}
