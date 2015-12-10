package org.j8unit.repository.javax.swing.table;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class TableColumnTest
implements org.j8unit.repository.javax.swing.table.TableColumnTests<javax.swing.table.TableColumn> {

    @Override
    public javax.swing.table.TableColumn createNewSUT() {
        return new javax.swing.table.TableColumn();
    }

}
