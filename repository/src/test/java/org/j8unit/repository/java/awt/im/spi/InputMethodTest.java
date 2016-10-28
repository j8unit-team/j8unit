package org.j8unit.repository.java.awt.im.spi;

import java.awt.im.spi.InputMethod;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class InputMethodTest
implements org.j8unit.repository.java.awt.im.spi.InputMethodTests<InputMethod> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.im.spi.InputMethod]

    @Override
    public InputMethod createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.awt.im.spi.InputMethod], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.im.spi.InputMethod]

}
