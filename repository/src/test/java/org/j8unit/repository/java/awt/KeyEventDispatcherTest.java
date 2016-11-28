package org.j8unit.repository.java.awt;

import java.awt.KeyEventDispatcher;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link KeyEventDispatcher} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.java.awt.KeyEventDispatcherTests}).
 */
@RunWith(J8Unit4.class)
public class KeyEventDispatcherTest
implements KeyEventDispatcherTests<KeyEventDispatcher> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.KeyEventDispatcher]

    @Override
    public KeyEventDispatcher createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.awt.KeyEventDispatcher], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.awt.KeyEventDispatcher]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.awt.KeyEventDispatcher]

}
