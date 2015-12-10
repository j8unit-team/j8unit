package org.j8unit.repository.javax.swing.event;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class InternalFrameEventClassTest
implements org.j8unit.repository.javax.swing.event.InternalFrameEventClassTests<javax.swing.event.InternalFrameEvent> {

    @Override
    public Class<javax.swing.event.InternalFrameEvent> createNewSUT() {
        return javax.swing.event.InternalFrameEvent.class;
    }

}
