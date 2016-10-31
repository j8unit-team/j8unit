package org.j8unit.repository.javax.print.event;

import javax.print.event.PrintJobListener;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PrintJobListenerClassTest
implements org.j8unit.repository.javax.print.event.PrintJobListenerClassTests<PrintJobListener> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.print.event.PrintJobListener]

    @Override
    public Class<PrintJobListener> createNewSUT() {
        return PrintJobListener.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.print.event.PrintJobListener]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.print.event.PrintJobListener]

}
