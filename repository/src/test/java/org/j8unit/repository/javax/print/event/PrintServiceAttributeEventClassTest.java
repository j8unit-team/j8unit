package org.j8unit.repository.javax.print.event;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PrintServiceAttributeEventClassTest
implements org.j8unit.repository.javax.print.event.PrintServiceAttributeEventClassTests<javax.print.event.PrintServiceAttributeEvent> {

    @Override
    public Class<javax.print.event.PrintServiceAttributeEvent> createNewSUT() {
        return javax.print.event.PrintServiceAttributeEvent.class;
    }

}
