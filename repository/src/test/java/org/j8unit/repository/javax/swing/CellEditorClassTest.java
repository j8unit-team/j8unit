package org.j8unit.repository.javax.swing;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CellEditorClassTest
implements org.j8unit.repository.javax.swing.CellEditorClassTests<javax.swing.CellEditor> {

    @Override
    public Class<javax.swing.CellEditor> createNewSUT() {
        return javax.swing.CellEditor.class;
    }

}
