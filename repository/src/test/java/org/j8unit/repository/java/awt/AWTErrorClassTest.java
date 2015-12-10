package org.j8unit.repository.java.awt;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AWTErrorClassTest
implements org.j8unit.repository.java.awt.AWTErrorClassTests<java.awt.AWTError> {

    @Override
    public Class<java.awt.AWTError> createNewSUT() {
        return java.awt.AWTError.class;
    }

}
