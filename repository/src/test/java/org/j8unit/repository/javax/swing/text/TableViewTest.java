package org.j8unit.repository.javax.swing.text;

import javax.swing.text.TableView;
import javax.swing.text.TableView.TableCell;
import javax.swing.text.TableView.TableRow;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class TableViewTest
implements org.j8unit.repository.javax.swing.text.TableViewTests<TableView> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.text.TableView]

    @Override
    public TableView createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.swing.text.TableView], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.text.TableView]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.text.TableView]

    @RunWith(J8Unit4.class)
    public static class TableRowTest
    implements org.j8unit.repository.javax.swing.text.TableViewTests.TableRowTests<TableRow> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.text.TableView$TableRow]

        @Override
        public TableRow createNewSUT() {
            throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.swing.text.TableView.TableRow], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.text.TableView$TableRow]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.text.TableView$TableRow]

    }

    @RunWith(J8Unit4.class)
    public static class TableCellTest
    implements org.j8unit.repository.javax.swing.text.TableViewTests.TableCellTests<TableCell> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.text.TableView$TableCell]

        @Override
        public TableCell createNewSUT() {
            throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.swing.text.TableView.TableCell], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.text.TableView$TableCell]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.text.TableView$TableCell]

    }

}
