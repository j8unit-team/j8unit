package org.j8unit.repository.javax.swing.text;

import static org.junit.Assert.fail;
import javax.swing.text.TableView;
import javax.swing.text.TableView.TableCell;
import javax.swing.text.TableView.TableRow;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link TableView} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.javax.swing.text.TableViewClassTests}).
 */
@RunWith(J8Unit4.class)
public class TableViewClassTest
implements TableViewClassTests<TableView> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.text.TableView]

    @Override
    public Class<TableView> createNewSUT() {
        return TableView.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.swing.text.TableView#TableView(javax.swing.text.Element) public
     * javax.swing.text.TableView(javax.swing.text.Element)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("Cannot construct an abstract class!")
    @Test
    @Category(Draft.class)
    public void create_TableView_Element()
    throws Exception {
        fail("Cannot construct an abstract class!");
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.text.TableView]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.text.TableView]

    /**
     * Specific JUnit test class to proof the type relevant aspects of type {@link TableRow} (by simply reusing the
     * J8Unit test interface {@link org.j8unit.repository.javax.swing.text.TableViewClassTests.TableRowClassTests}).
     */
    @RunWith(J8Unit4.class)
    public static class TableRowClassTest
    implements TableRowClassTests<TableRow> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.text.TableView$TableRow]

        @Override
        public Class<TableRow> createNewSUT() {
            return TableRow.class;
        }

        /**
         * <p>
         * Test method for the hereby targeted constructor-under-test
         * {@link javax.swing.text.TableView.TableRow#TableRow(javax.swing.text.TableView, javax.swing.text.Element)
         * public javax.swing.text.TableView$TableRow(javax.swing.text.TableView,javax.swing.text.Element)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @since 0.9.0
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public void create_TableRow_TableView_Element()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final TableRow sut = null; // = new TableRow(javax.swing.text.TableView, javax.swing.text.Element);
        }

        // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.text.TableView$TableRow]

        // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.text.TableView$TableRow]

    }

    /**
     * Specific JUnit test class to proof the type relevant aspects of type {@link TableCell} (by simply reusing the
     * J8Unit test interface {@link org.j8unit.repository.javax.swing.text.TableViewClassTests.TableCellClassTests}).
     */
    @RunWith(J8Unit4.class)
    @SuppressWarnings("deprecation")
    public static class TableCellClassTest
    implements TableCellClassTests<TableCell> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.text.TableView$TableCell]

        @Override
        public Class<TableCell> createNewSUT() {
            return TableCell.class;
        }

        /**
         * <p>
         * Test method for the hereby targeted constructor-under-test
         * {@link javax.swing.text.TableView.TableCell#TableCell(javax.swing.text.TableView, javax.swing.text.Element)
         * public javax.swing.text.TableView$TableCell(javax.swing.text.TableView,javax.swing.text.Element)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @since 0.9.0
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public void create_TableCell_TableView_Element()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final TableCell sut = null; // = new TableCell(javax.swing.text.TableView, javax.swing.text.Element);
        }

        // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.text.TableView$TableCell]

        // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.text.TableView$TableCell]

    }

}
