package org.j8unit.repository.javax.swing;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class JInternalFrameClassTest
implements org.j8unit.repository.javax.swing.JInternalFrameClassTests<javax.swing.JInternalFrame> {

    @Override
    public Class<javax.swing.JInternalFrame> createNewSUT() {
        return javax.swing.JInternalFrame.class;
    }

    @RunWith(J8Unit4.class)
    public static class JDesktopIconClassTest
    implements org.j8unit.repository.javax.swing.JInternalFrameClassTests.JDesktopIconClassTests<javax.swing.JInternalFrame.JDesktopIcon> {

        @Override
        public Class<javax.swing.JInternalFrame.JDesktopIcon> createNewSUT() {
            return javax.swing.JInternalFrame.JDesktopIcon.class;
        }

    }

}
