package org.j8unit.repository.javax.swing.table;

import javax.swing.table.TableModel;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class TableModelClassTest
implements org.j8unit.repository.javax.swing.table.TableModelClassTests<TableModel> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.table.TableModel]

    @Override
    public Class<TableModel> createNewSUT() {
        return TableModel.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.table.TableModel]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.table.TableModel]

}
