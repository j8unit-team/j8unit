package org.j8unit.repository.javax.swing.table;

import javax.swing.table.TableColumnModel;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link TableColumnModel} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.swing.table.TableColumnModelClassTests}).
 */

@RunWith(J8Unit4.class)
public class TableColumnModelClassTest
implements TableColumnModelClassTests<TableColumnModel> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.table.TableColumnModel]

    @Override
    public Class<TableColumnModel> createNewSUT() {
        return TableColumnModel.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.table.TableColumnModel]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.table.TableColumnModel]

}
