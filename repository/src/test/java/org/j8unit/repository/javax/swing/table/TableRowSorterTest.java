package org.j8unit.repository.javax.swing.table;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class TableRowSorterTest<M extends javax.swing.table.TableModel>
implements org.j8unit.repository.javax.swing.table.TableRowSorterTests<javax.swing.table.TableRowSorter<M>, M> {

    @Override
    public javax.swing.table.TableRowSorter<M> createNewSUT() {
        return new javax.swing.table.TableRowSorter();
    }

}
