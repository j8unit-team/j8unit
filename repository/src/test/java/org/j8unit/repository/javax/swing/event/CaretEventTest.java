package org.j8unit.repository.javax.swing.event;

import javax.swing.event.CaretEvent;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link CaretEvent} (by simply reusing the
 * J8Unit test interface {@link CaretEventTests}).
 */

@RunWith(J8Unit4.class)
public class CaretEventTest
implements CaretEventTests<CaretEvent> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.event.CaretEvent]

    @Override
    public CaretEvent createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.swing.event.CaretEvent], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.event.CaretEvent]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.event.CaretEvent]

}
