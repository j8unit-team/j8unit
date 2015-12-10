package org.j8unit.repository.javax.swing.event;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ChangeEventClassTest
implements org.j8unit.repository.javax.swing.event.ChangeEventClassTests<javax.swing.event.ChangeEvent> {

    @Override
    public Class<javax.swing.event.ChangeEvent> createNewSUT() {
        return javax.swing.event.ChangeEvent.class;
    }

}
