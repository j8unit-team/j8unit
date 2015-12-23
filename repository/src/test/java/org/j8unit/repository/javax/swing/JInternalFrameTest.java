package org.j8unit.repository.javax.swing;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class JInternalFrameTest
implements org.j8unit.repository.javax.swing.JInternalFrameTests<javax.swing.JInternalFrame> {

    @Override
    public javax.swing.JInternalFrame createNewSUT() {
        return new javax.swing.JInternalFrame();
    }

    @RunWith(J8Unit4.class)
    public static class JDesktopIconTest
    implements org.j8unit.repository.javax.swing.JInternalFrameTests.JDesktopIconTests<javax.swing.JInternalFrame.JDesktopIcon> {

        @Override
        public javax.swing.JInternalFrame.JDesktopIcon createNewSUT() {
            throw new AssumptionViolatedException("There is no default constructor for [javax.swing.JInternalFrame.JDesktopIcon] available.");
        }

    }

}
