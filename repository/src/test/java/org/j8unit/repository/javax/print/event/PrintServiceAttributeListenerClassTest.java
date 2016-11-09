package org.j8unit.repository.javax.print.event;

import javax.print.event.PrintServiceAttributeListener;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link PrintServiceAttributeListener} (by simply
 * reusing the J8Unit test interface {@link PrintServiceAttributeListenerClassTests}).
 */

@RunWith(J8Unit4.class)
public class PrintServiceAttributeListenerClassTest
implements PrintServiceAttributeListenerClassTests<PrintServiceAttributeListener> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.print.event.PrintServiceAttributeListener]

    @Override
    public Class<PrintServiceAttributeListener> createNewSUT() {
        return PrintServiceAttributeListener.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.print.event.PrintServiceAttributeListener]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.print.event.PrintServiceAttributeListener]

}
