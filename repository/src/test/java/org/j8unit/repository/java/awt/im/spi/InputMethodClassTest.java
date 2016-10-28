package org.j8unit.repository.java.awt.im.spi;

import java.awt.im.spi.InputMethod;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class InputMethodClassTest
implements org.j8unit.repository.java.awt.im.spi.InputMethodClassTests<InputMethod> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.awt.im.spi.InputMethod]

    @Override
    public Class<InputMethod> createNewSUT() {
        return InputMethod.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.awt.im.spi.InputMethod]

}
