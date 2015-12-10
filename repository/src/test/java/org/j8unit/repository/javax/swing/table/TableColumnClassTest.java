package org.j8unit.repository.javax.swing.table;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class TableColumnClassTest
implements org.j8unit.repository.javax.swing.table.TableColumnClassTests<javax.swing.table.TableColumn> {

    @Override
    public Class<javax.swing.table.TableColumn> createNewSUT() {
        return javax.swing.table.TableColumn.class;
    }

}
