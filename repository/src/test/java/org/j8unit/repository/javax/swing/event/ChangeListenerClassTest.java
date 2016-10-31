package org.j8unit.repository.javax.swing.event;

import javax.swing.event.ChangeListener;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ChangeListenerClassTest
implements org.j8unit.repository.javax.swing.event.ChangeListenerClassTests<ChangeListener> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.event.ChangeListener]

    @Override
    public Class<ChangeListener> createNewSUT() {
        return ChangeListener.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.event.ChangeListener]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.event.ChangeListener]

}
