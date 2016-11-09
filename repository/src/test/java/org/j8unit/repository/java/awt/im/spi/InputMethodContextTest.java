package org.j8unit.repository.java.awt.im.spi;

import java.awt.im.spi.InputMethodContext;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link InputMethodContext} (by simply
 * reusing the J8Unit test interface {@link InputMethodContextTests}).
 */

@RunWith(J8Unit4.class)
public class InputMethodContextTest
implements InputMethodContextTests<InputMethodContext> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.im.spi.InputMethodContext]

    @Override
    public InputMethodContext createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.awt.im.spi.InputMethodContext], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.awt.im.spi.InputMethodContext]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.awt.im.spi.InputMethodContext]

}
