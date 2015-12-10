package org.j8unit.repository.javax.swing;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class JToolBarTest
implements org.j8unit.repository.javax.swing.JToolBarTests<javax.swing.JToolBar> {

    @RunWith(J8Unit4.class)
    public static class SeparatorTest
    implements org.j8unit.repository.javax.swing.JToolBarTests.SeparatorTests<javax.swing.JToolBar.Separator> {

        @Override
        public javax.swing.JToolBar.Separator createNewSUT() {
            return new javax.swing.JToolBar.Separator();
        }

    }

    @Override
    public javax.swing.JToolBar createNewSUT() {
        return new javax.swing.JToolBar();
    }

}
