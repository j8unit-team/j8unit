package org.j8unit.repository.java.awt.event;

import java.awt.event.WindowAdapter;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link WindowAdapter} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.awt.event.WindowAdapterTests}).
 */

@RunWith(J8Unit4.class)
public class WindowAdapterTest
implements WindowAdapterTests<WindowAdapter> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.event.WindowAdapter]

    @Override
    public WindowAdapter createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.awt.event.WindowAdapter], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.awt.event.WindowAdapter]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.awt.event.WindowAdapter]

}
