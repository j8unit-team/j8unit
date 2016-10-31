package org.j8unit.repository.javax.swing.table;

import javax.swing.table.AbstractTableModel;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AbstractTableModelTest
implements org.j8unit.repository.javax.swing.table.AbstractTableModelTests<AbstractTableModel> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.table.AbstractTableModel]

    @Override
    public AbstractTableModel createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.swing.table.AbstractTableModel], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.table.AbstractTableModel]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.table.AbstractTableModel]

}
