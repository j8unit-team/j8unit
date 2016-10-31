package org.j8unit.repository.javax.swing.table;

import javax.swing.table.TableModel;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class TableModelTest
implements org.j8unit.repository.javax.swing.table.TableModelTests<TableModel> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.table.TableModel]

    @Override
    public TableModel createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.swing.table.TableModel], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.table.TableModel]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.table.TableModel]

}
