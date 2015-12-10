package org.j8unit.repository.javax.swing.event;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ChangeListenerClassTest
implements org.j8unit.repository.javax.swing.event.ChangeListenerClassTests<javax.swing.event.ChangeListener> {

    @Override
    public Class<javax.swing.event.ChangeListener> createNewSUT() {
        return javax.swing.event.ChangeListener.class;
    }

}
