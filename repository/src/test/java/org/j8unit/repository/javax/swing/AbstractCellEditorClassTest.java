package org.j8unit.repository.javax.swing;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AbstractCellEditorClassTest
implements org.j8unit.repository.javax.swing.AbstractCellEditorClassTests<javax.swing.AbstractCellEditor> {

    @Override
    public Class<javax.swing.AbstractCellEditor> createNewSUT() {
        return javax.swing.AbstractCellEditor.class;
    }

}
