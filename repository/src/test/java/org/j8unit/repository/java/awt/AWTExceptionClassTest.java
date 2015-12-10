package org.j8unit.repository.java.awt;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AWTExceptionClassTest
implements org.j8unit.repository.java.awt.AWTExceptionClassTests<java.awt.AWTException> {

    @Override
    public Class<java.awt.AWTException> createNewSUT() {
        return java.awt.AWTException.class;
    }

}
