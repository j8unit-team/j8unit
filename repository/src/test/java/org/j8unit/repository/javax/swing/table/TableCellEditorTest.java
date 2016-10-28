package org.j8unit.repository.javax.swing.table;

import javax.swing.table.TableCellEditor;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class TableCellEditorTest
implements org.j8unit.repository.javax.swing.table.TableCellEditorTests<TableCellEditor> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.table.TableCellEditor]

    @Override
    public TableCellEditor createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.swing.table.TableCellEditor], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.table.TableCellEditor]

}
