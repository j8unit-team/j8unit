package org.j8unit.repository.javax.swing;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class JPopupMenuTest
implements org.j8unit.repository.javax.swing.JPopupMenuTests<javax.swing.JPopupMenu> {

    @RunWith(J8Unit4.class)
    public static class SeparatorTest
    implements org.j8unit.repository.javax.swing.JPopupMenuTests.SeparatorTests<javax.swing.JPopupMenu.Separator> {

        @Override
        public javax.swing.JPopupMenu.Separator createNewSUT() {
            return new javax.swing.JPopupMenu.Separator();
        }

    }

    @Override
    public javax.swing.JPopupMenu createNewSUT() {
        return new javax.swing.JPopupMenu();
    }

}
