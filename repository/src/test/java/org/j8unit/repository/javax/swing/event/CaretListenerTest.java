package org.j8unit.repository.javax.swing.event;

import javax.swing.event.CaretListener;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CaretListenerTest
implements org.j8unit.repository.javax.swing.event.CaretListenerTests<CaretListener> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.event.CaretListener]

    @Override
    public CaretListener createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.swing.event.CaretListener], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.event.CaretListener]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.event.CaretListener]

}
