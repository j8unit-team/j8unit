package org.j8unit.repository.java.awt;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AWTExceptionTest
implements org.j8unit.repository.java.awt.AWTExceptionTests<java.awt.AWTException> {

    @Override
    public java.awt.AWTException createNewSUT() {
        throw new AssertionError("There is no default constructor for [java.awt.AWTException] available.");
    }

}
