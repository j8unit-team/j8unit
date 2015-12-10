package org.j8unit.repository.java.awt;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AWTErrorTest
implements org.j8unit.repository.java.awt.AWTErrorTests<java.awt.AWTError> {

    @Override
    public java.awt.AWTError createNewSUT() {
        throw new AssertionError("There is no default constructor for [java.awt.AWTError] available.");
    }

}
