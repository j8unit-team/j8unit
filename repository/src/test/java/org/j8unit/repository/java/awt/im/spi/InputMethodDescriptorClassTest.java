package org.j8unit.repository.java.awt.im.spi;

import java.awt.im.spi.InputMethodDescriptor;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link InputMethodDescriptor} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.java.awt.im.spi.InputMethodDescriptorClassTests}).
 */
@RunWith(J8Unit4.class)
public class InputMethodDescriptorClassTest
implements InputMethodDescriptorClassTests<InputMethodDescriptor> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.awt.im.spi.InputMethodDescriptor]

    @Override
    public Class<InputMethodDescriptor> createNewSUT() {
        return InputMethodDescriptor.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.awt.im.spi.InputMethodDescriptor]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.awt.im.spi.InputMethodDescriptor]

}
