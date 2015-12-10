package org.j8unit.repository.javax.swing;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class JFrameClassTest
implements org.j8unit.repository.javax.swing.JFrameClassTests<javax.swing.JFrame> {

    @Override
    public Class<javax.swing.JFrame> createNewSUT() {
        return javax.swing.JFrame.class;
    }

}
