package org.j8unit.repository.javax.swing;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DefaultListCellRendererTest
implements org.j8unit.repository.javax.swing.DefaultListCellRendererTests<javax.swing.DefaultListCellRenderer> {

    @Override
    public javax.swing.DefaultListCellRenderer createNewSUT() {
        return new javax.swing.DefaultListCellRenderer();
    }

    @RunWith(J8Unit4.class)
    public static class UIResourceTest
    implements org.j8unit.repository.javax.swing.DefaultListCellRendererTests.UIResourceTests<javax.swing.DefaultListCellRenderer.UIResource> {

        @Override
        public javax.swing.DefaultListCellRenderer.UIResource createNewSUT() {
            return new javax.swing.DefaultListCellRenderer.UIResource();
        }

    }

}
