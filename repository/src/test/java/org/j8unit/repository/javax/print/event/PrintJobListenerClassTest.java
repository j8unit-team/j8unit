package org.j8unit.repository.javax.print.event;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PrintJobListenerClassTest
implements org.j8unit.repository.javax.print.event.PrintJobListenerClassTests<javax.print.event.PrintJobListener> {

    @Override
    public Class<javax.print.event.PrintJobListener> createNewSUT() {
        return javax.print.event.PrintJobListener.class;
    }

}
