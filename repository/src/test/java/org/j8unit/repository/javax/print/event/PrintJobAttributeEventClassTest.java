package org.j8unit.repository.javax.print.event;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PrintJobAttributeEventClassTest
implements org.j8unit.repository.javax.print.event.PrintJobAttributeEventClassTests<javax.print.event.PrintJobAttributeEvent> {

    @Override
    public Class<javax.print.event.PrintJobAttributeEvent> createNewSUT() {
        return javax.print.event.PrintJobAttributeEvent.class;
    }

}
