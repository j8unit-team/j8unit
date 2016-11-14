package org.j8unit.repository.java.awt;

import java.awt.KeyboardFocusManager;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link KeyboardFocusManager} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.java.awt.KeyboardFocusManagerTests}).
 */

@RunWith(J8Unit4.class)
public class KeyboardFocusManagerTest
implements KeyboardFocusManagerTests<KeyboardFocusManager> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.KeyboardFocusManager]

    @Override
    public KeyboardFocusManager createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.awt.KeyboardFocusManager], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.awt.KeyboardFocusManager]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.awt.KeyboardFocusManager]

}
