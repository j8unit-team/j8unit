package org.j8unit.repository.javax.swing.table;

import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@SuppressWarnings("rawtypes")
@RunWith(J8Unit4.class)
public class TableRowSorterClassTest
implements org.j8unit.repository.javax.swing.table.TableRowSorterClassTests<TableRowSorter> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.table.TableRowSorter]

    @Override
    public Class<TableRowSorter> createNewSUT() {
        return TableRowSorter.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link TableRowSorter#TableRowSorter() public
     * javax.swing.table.TableRowSorter()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void create_TableRowSorter()
    throws Exception {
        // create new instance
        final TableRowSorter sut = new TableRowSorter();
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link TableRowSorter#TableRowSorter(TableModel)
     * public javax.swing.table.TableRowSorter(M)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void create_TableRowSorter_TableModel()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final TableRowSorter sut = null; // = new TableRowSorter(TableModel);
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.table.TableRowSorter]

}
