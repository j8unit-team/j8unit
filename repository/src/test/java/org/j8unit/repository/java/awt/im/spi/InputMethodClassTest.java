package org.j8unit.repository.java.awt.im.spi;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class InputMethodClassTest
implements org.j8unit.repository.java.awt.im.spi.InputMethodClassTests<java.awt.im.spi.InputMethod> {

    @Override
    public Class<java.awt.im.spi.InputMethod> createNewSUT() {
        return java.awt.im.spi.InputMethod.class;
    }

}
