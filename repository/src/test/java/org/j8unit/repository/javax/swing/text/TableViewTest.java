package org.j8unit.repository.javax.swing.text;

import javax.swing.text.TableView;
import javax.swing.text.TableView.TableCell;
import javax.swing.text.TableView.TableRow;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link TableView} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.swing.text.TableViewTests}).
 */
@RunWith(J8Unit4.class)
public class TableViewTest
implements TableViewTests<TableView> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.text.TableView]

    @Override
    public TableView createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.swing.text.TableView], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.text.TableView]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.text.TableView]

    /**
     * Specific JUnit test class to proof the instance relevant aspects of type {@link TableRow} (by simply reusing the
     * J8Unit test interface {@link org.j8unit.repository.javax.swing.text.TableViewTests.TableRowTests}).
     */
    @RunWith(J8Unit4.class)
    public static class TableRowTest
    implements TableRowTests<TableRow> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.text.TableView$TableRow]

        @Override
        public TableRow createNewSUT() {
            throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.swing.text.TableView.TableRow], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.text.TableView$TableRow]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.text.TableView$TableRow]

    }

    /**
     * Specific JUnit test class to proof the instance relevant aspects of type {@link TableCell} (by simply reusing the
     * J8Unit test interface {@link org.j8unit.repository.javax.swing.text.TableViewTests.TableCellTests}).
     */
    @RunWith(J8Unit4.class)
    @SuppressWarnings("deprecation")
    public static class TableCellTest
    implements TableCellTests<TableCell> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.text.TableView$TableCell]

        @Override
        public TableCell createNewSUT() {
            throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.swing.text.TableView.TableCell], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.text.TableView$TableCell]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.text.TableView$TableCell]

    }

}
