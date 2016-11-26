package org.j8unit.repository.javax.swing.table;

import javax.swing.table.TableCellRenderer;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link TableCellRenderer} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.swing.table.TableCellRendererClassTests}).
 */
@RunWith(J8Unit4.class)
public class TableCellRendererClassTest
implements TableCellRendererClassTests<TableCellRenderer> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.table.TableCellRenderer]

    @Override
    public Class<TableCellRenderer> createNewSUT() {
        return TableCellRenderer.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.table.TableCellRenderer]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.table.TableCellRenderer]

}
