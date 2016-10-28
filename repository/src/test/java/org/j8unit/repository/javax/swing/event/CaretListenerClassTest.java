package org.j8unit.repository.javax.swing.event;

import javax.swing.event.CaretListener;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CaretListenerClassTest
implements org.j8unit.repository.javax.swing.event.CaretListenerClassTests<CaretListener> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.event.CaretListener]

    @Override
    public Class<CaretListener> createNewSUT() {
        return CaretListener.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.event.CaretListener]

}
