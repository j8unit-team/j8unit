package org.j8unit.repository.javax.swing;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DebugGraphicsTest
implements org.j8unit.repository.javax.swing.DebugGraphicsTests<javax.swing.DebugGraphics> {

    @Override
    public javax.swing.DebugGraphics createNewSUT() {
        return new javax.swing.DebugGraphics();
    }

}
