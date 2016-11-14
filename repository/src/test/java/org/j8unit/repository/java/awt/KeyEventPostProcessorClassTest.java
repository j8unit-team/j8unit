package org.j8unit.repository.java.awt;

import java.awt.KeyEventPostProcessor;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link KeyEventPostProcessor} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.java.awt.KeyEventPostProcessorClassTests}).
 */

@RunWith(J8Unit4.class)
public class KeyEventPostProcessorClassTest
implements KeyEventPostProcessorClassTests<KeyEventPostProcessor> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.awt.KeyEventPostProcessor]

    @Override
    public Class<KeyEventPostProcessor> createNewSUT() {
        return KeyEventPostProcessor.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.awt.KeyEventPostProcessor]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.awt.KeyEventPostProcessor]

}
