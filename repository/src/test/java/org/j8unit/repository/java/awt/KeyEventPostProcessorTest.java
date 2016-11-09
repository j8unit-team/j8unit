package org.j8unit.repository.java.awt;

import java.awt.KeyEventPostProcessor;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link KeyEventPostProcessor} (by simply
 * reusing the J8Unit test interface {@link KeyEventPostProcessorTests}).
 */

@RunWith(J8Unit4.class)
public class KeyEventPostProcessorTest
implements KeyEventPostProcessorTests<KeyEventPostProcessor> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.KeyEventPostProcessor]

    @Override
    public KeyEventPostProcessor createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.awt.KeyEventPostProcessor], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.awt.KeyEventPostProcessor]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.awt.KeyEventPostProcessor]

}
