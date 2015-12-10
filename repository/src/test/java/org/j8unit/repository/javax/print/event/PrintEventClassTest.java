package org.j8unit.repository.javax.print.event;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PrintEventClassTest
implements org.j8unit.repository.javax.print.event.PrintEventClassTests<javax.print.event.PrintEvent> {

    @Override
    public Class<javax.print.event.PrintEvent> createNewSUT() {
        return javax.print.event.PrintEvent.class;
    }

}
