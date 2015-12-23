package org.j8unit.repository.javax.swing;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DefaultListCellRendererClassTest
implements org.j8unit.repository.javax.swing.DefaultListCellRendererClassTests<javax.swing.DefaultListCellRenderer> {

    @Override
    public Class<javax.swing.DefaultListCellRenderer> createNewSUT() {
        return javax.swing.DefaultListCellRenderer.class;
    }

    @RunWith(J8Unit4.class)
    public static class UIResourceClassTest
    implements org.j8unit.repository.javax.swing.DefaultListCellRendererClassTests.UIResourceClassTests<javax.swing.DefaultListCellRenderer.UIResource> {

        @Override
        public Class<javax.swing.DefaultListCellRenderer.UIResource> createNewSUT() {
            return javax.swing.DefaultListCellRenderer.UIResource.class;
        }

    }

}
