package org.j8unit.repository.javax.swing;

import javax.swing.CellEditor;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link CellEditor} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.javax.swing.CellEditorClassTests}).
 */

@RunWith(J8Unit4.class)
public class CellEditorClassTest
implements CellEditorClassTests<CellEditor> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.CellEditor]

    @Override
    public Class<CellEditor> createNewSUT() {
        return CellEditor.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.CellEditor]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.CellEditor]

}
