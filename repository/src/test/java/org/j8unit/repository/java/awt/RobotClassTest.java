package org.j8unit.repository.java.awt;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class RobotClassTest
implements org.j8unit.repository.java.awt.RobotClassTests<java.awt.Robot> {

    @Override
    public Class<java.awt.Robot> createNewSUT() {
        return java.awt.Robot.class;
    }

}
