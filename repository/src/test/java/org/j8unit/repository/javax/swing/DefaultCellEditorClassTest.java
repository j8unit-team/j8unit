package org.j8unit.repository.javax.swing;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DefaultCellEditorClassTest
implements org.j8unit.repository.javax.swing.DefaultCellEditorClassTests<javax.swing.DefaultCellEditor> {

    @Override
    public Class<javax.swing.DefaultCellEditor> createNewSUT() {
        return javax.swing.DefaultCellEditor.class;
    }

}
