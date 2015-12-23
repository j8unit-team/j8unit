package org.j8unit.repository.javax.swing;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class JPopupMenuClassTest
implements org.j8unit.repository.javax.swing.JPopupMenuClassTests<javax.swing.JPopupMenu> {

    @Override
    public Class<javax.swing.JPopupMenu> createNewSUT() {
        return javax.swing.JPopupMenu.class;
    }

    @RunWith(J8Unit4.class)
    public static class SeparatorClassTest
    implements org.j8unit.repository.javax.swing.JPopupMenuClassTests.SeparatorClassTests<javax.swing.JPopupMenu.Separator> {

        @Override
        public Class<javax.swing.JPopupMenu.Separator> createNewSUT() {
            return javax.swing.JPopupMenu.Separator.class;
        }

    }

}
