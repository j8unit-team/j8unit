package org.j8unit.repository.javax.swing.table;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DefaultTableModelTest
implements org.j8unit.repository.javax.swing.table.DefaultTableModelTests<javax.swing.table.DefaultTableModel> {

    @Override
    public javax.swing.table.DefaultTableModel createNewSUT() {
        return new javax.swing.table.DefaultTableModel();
    }

}
