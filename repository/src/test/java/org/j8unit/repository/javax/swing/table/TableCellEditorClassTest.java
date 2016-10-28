package org.j8unit.repository.javax.swing.table;

import javax.swing.table.TableCellEditor;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class TableCellEditorClassTest
implements org.j8unit.repository.javax.swing.table.TableCellEditorClassTests<TableCellEditor> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.table.TableCellEditor]

    @Override
    public Class<TableCellEditor> createNewSUT() {
        return TableCellEditor.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.table.TableCellEditor]

}
