package org.j8unit.repository.javax.swing.event;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CaretListenerClassTest
implements org.j8unit.repository.javax.swing.event.CaretListenerClassTests<javax.swing.event.CaretListener> {

    @Override
    public Class<javax.swing.event.CaretListener> createNewSUT() {
        return javax.swing.event.CaretListener.class;
    }

}
