package org.j8unit.repository.java.awt.im;

import java.awt.im.InputContext;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link InputContext} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.awt.im.InputContextTests}).
 */

@RunWith(J8Unit4.class)
public class InputContextTest
implements InputContextTests<InputContext> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.im.InputContext]

    @Override
    public InputContext createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.awt.im.InputContext], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.awt.im.InputContext]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.awt.im.InputContext]

}
