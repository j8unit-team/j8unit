package org.j8unit.repository.javax.swing;

import javax.swing.CellEditor;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CellEditorClassTest
implements org.j8unit.repository.javax.swing.CellEditorClassTests<CellEditor> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.CellEditor]

    @Override
    public Class<CellEditor> createNewSUT() {
        return CellEditor.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.CellEditor]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.CellEditor]

}
