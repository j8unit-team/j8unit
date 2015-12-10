package org.j8unit.repository.javax.swing.event;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CaretEventClassTest
implements org.j8unit.repository.javax.swing.event.CaretEventClassTests<javax.swing.event.CaretEvent> {

    @Override
    public Class<javax.swing.event.CaretEvent> createNewSUT() {
        return javax.swing.event.CaretEvent.class;
    }

}
