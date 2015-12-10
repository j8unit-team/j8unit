package org.j8unit.repository.javax.swing.table;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DefaultTableCellRendererTest
implements org.j8unit.repository.javax.swing.table.DefaultTableCellRendererTests<javax.swing.table.DefaultTableCellRenderer> {

    @RunWith(J8Unit4.class)
    public static class UIResourceTest
    implements org.j8unit.repository.javax.swing.table.DefaultTableCellRendererTests.UIResourceTests<javax.swing.table.DefaultTableCellRenderer.UIResource> {

        @Override
        public javax.swing.table.DefaultTableCellRenderer.UIResource createNewSUT() {
            return new javax.swing.table.DefaultTableCellRenderer.UIResource();
        }

    }

    @Override
    public javax.swing.table.DefaultTableCellRenderer createNewSUT() {
        return new javax.swing.table.DefaultTableCellRenderer();
    }

}
