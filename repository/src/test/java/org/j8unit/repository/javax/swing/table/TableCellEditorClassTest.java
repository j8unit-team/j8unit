package org.j8unit.repository.javax.swing.table;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class TableCellEditorClassTest
implements org.j8unit.repository.javax.swing.table.TableCellEditorClassTests<javax.swing.table.TableCellEditor> {

    @Override
    public Class<javax.swing.table.TableCellEditor> createNewSUT() {
        return javax.swing.table.TableCellEditor.class;
    }

}
