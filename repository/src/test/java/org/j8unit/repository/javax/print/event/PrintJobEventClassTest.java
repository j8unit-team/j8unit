package org.j8unit.repository.javax.print.event;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PrintJobEventClassTest
implements org.j8unit.repository.javax.print.event.PrintJobEventClassTests<javax.print.event.PrintJobEvent> {

    @Override
    public Class<javax.print.event.PrintJobEvent> createNewSUT() {
        return javax.print.event.PrintJobEvent.class;
    }

}
