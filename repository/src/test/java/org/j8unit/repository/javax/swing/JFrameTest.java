package org.j8unit.repository.javax.swing;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class JFrameTest
implements org.j8unit.repository.javax.swing.JFrameTests<javax.swing.JFrame> {

    @Override
    public javax.swing.JFrame createNewSUT() {
        return new javax.swing.JFrame();
    }

}
