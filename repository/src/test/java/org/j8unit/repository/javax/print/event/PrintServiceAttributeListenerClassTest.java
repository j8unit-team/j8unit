package org.j8unit.repository.javax.print.event;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PrintServiceAttributeListenerClassTest
implements org.j8unit.repository.javax.print.event.PrintServiceAttributeListenerClassTests<javax.print.event.PrintServiceAttributeListener> {

    @Override
    public Class<javax.print.event.PrintServiceAttributeListener> createNewSUT() {
        return javax.print.event.PrintServiceAttributeListener.class;
    }

}
