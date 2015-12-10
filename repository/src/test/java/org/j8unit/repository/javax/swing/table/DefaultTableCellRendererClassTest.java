package org.j8unit.repository.javax.swing.table;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DefaultTableCellRendererClassTest
implements org.j8unit.repository.javax.swing.table.DefaultTableCellRendererClassTests<javax.swing.table.DefaultTableCellRenderer> {

    @RunWith(J8Unit4.class)
    public static class UIResourceClassTest
    implements
    org.j8unit.repository.javax.swing.table.DefaultTableCellRendererClassTests.UIResourceClassTests<javax.swing.table.DefaultTableCellRenderer.UIResource> {

        @Override
        public Class<javax.swing.table.DefaultTableCellRenderer.UIResource> createNewSUT() {
            return javax.swing.table.DefaultTableCellRenderer.UIResource.class;
        }

    }

    @Override
    public Class<javax.swing.table.DefaultTableCellRenderer> createNewSUT() {
        return javax.swing.table.DefaultTableCellRenderer.class;
    }

}
