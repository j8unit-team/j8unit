package org.j8unit.repository.java.awt.event;

import java.awt.event.KeyAdapter;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link KeyAdapter} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.awt.event.KeyAdapterTests}).
 */
@RunWith(J8Unit4.class)
public class KeyAdapterTest
implements KeyAdapterTests<KeyAdapter> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.event.KeyAdapter]

    @Override
    public KeyAdapter createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.awt.event.KeyAdapter], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.awt.event.KeyAdapter]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.awt.event.KeyAdapter]

}
