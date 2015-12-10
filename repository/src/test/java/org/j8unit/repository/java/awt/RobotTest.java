package org.j8unit.repository.java.awt;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class RobotTest
implements org.j8unit.repository.java.awt.RobotTests<java.awt.Robot> {

    @Override
    public java.awt.Robot createNewSUT() {
        try {
            return new java.awt.Robot();
        } catch (final Exception cause) {
            throw new AssertionError("Failed to create new subject-under-test instance!", cause);
        }

    }

}
