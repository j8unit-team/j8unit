package org.j8unit.repository.javax.print.event;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PrintJobAttributeListenerClassTest
implements org.j8unit.repository.javax.print.event.PrintJobAttributeListenerClassTests<javax.print.event.PrintJobAttributeListener> {

    @Override
    public Class<javax.print.event.PrintJobAttributeListener> createNewSUT() {
        return javax.print.event.PrintJobAttributeListener.class;
    }

}
