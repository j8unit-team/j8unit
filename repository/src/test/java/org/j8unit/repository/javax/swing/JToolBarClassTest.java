package org.j8unit.repository.javax.swing;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class JToolBarClassTest
implements org.j8unit.repository.javax.swing.JToolBarClassTests<javax.swing.JToolBar> {

    @RunWith(J8Unit4.class)
    public static class SeparatorClassTest
    implements org.j8unit.repository.javax.swing.JToolBarClassTests.SeparatorClassTests<javax.swing.JToolBar.Separator> {

        @Override
        public Class<javax.swing.JToolBar.Separator> createNewSUT() {
            return javax.swing.JToolBar.Separator.class;
        }

    }

    @Override
    public Class<javax.swing.JToolBar> createNewSUT() {
        return javax.swing.JToolBar.class;
    }

}
