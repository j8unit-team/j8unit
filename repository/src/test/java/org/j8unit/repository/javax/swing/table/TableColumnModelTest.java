package org.j8unit.repository.javax.swing.table;

import javax.swing.table.TableColumnModel;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link TableColumnModel} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.javax.swing.table.TableColumnModelTests}).
 */

@RunWith(J8Unit4.class)
public class TableColumnModelTest
implements TableColumnModelTests<TableColumnModel> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.table.TableColumnModel]

    @Override
    public TableColumnModel createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.swing.table.TableColumnModel], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.table.TableColumnModel]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.table.TableColumnModel]

}
