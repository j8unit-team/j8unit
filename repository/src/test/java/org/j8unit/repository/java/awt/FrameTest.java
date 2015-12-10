package org.j8unit.repository.java.awt;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class FrameTest
implements org.j8unit.repository.java.awt.FrameTests<java.awt.Frame> {

    @Override
    public java.awt.Frame createNewSUT() {
        return new java.awt.Frame();
    }

}
