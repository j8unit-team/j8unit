package org.j8unit.repository.javax.swing.table;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class TableModelClassTest
implements org.j8unit.repository.javax.swing.table.TableModelClassTests<javax.swing.table.TableModel> {

    @Override
    public Class<javax.swing.table.TableModel> createNewSUT() {
        return javax.swing.table.TableModel.class;
    }

}
