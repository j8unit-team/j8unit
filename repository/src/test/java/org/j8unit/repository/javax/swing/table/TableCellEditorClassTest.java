package org.j8unit.repository.javax.swing.table;

import javax.swing.table.TableCellEditor;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link TableCellEditor} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.swing.table.TableCellEditorClassTests}).
 */

@RunWith(J8Unit4.class)
public class TableCellEditorClassTest
implements TableCellEditorClassTests<TableCellEditor> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.table.TableCellEditor]

    @Override
    public Class<TableCellEditor> createNewSUT() {
        return TableCellEditor.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.table.TableCellEditor]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.table.TableCellEditor]

}
