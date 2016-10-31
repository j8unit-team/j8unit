package org.j8unit.repository.javax.print.event;

import javax.print.event.PrintJobAttributeListener;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PrintJobAttributeListenerClassTest
implements org.j8unit.repository.javax.print.event.PrintJobAttributeListenerClassTests<PrintJobAttributeListener> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.print.event.PrintJobAttributeListener]

    @Override
    public Class<PrintJobAttributeListener> createNewSUT() {
        return PrintJobAttributeListener.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.print.event.PrintJobAttributeListener]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.print.event.PrintJobAttributeListener]

}
