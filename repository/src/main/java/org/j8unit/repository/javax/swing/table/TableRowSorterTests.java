package org.j8unit.repository.javax.swing.table;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.swing.table.TableRowSorter class javax.swing.table.TableRowSorter}, containing all
 * instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.swing.table.TableRowSorterClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface TableRowSorterTests<SUT extends javax.swing.table.TableRowSorter<M>, M extends javax.swing.table.TableModel>
extends org.j8unit.repository.javax.swing.DefaultRowSorterTests<SUT, M, java.lang.Integer> {

    /**
     * <p>
     * Test method for {@link javax.swing.table.TableRowSorter#getComparator(int) public java.util.Comparator
     * javax.swing.table.TableRowSorter.getComparator(int)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_getComparator_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.table.TableRowSorter#getStringConverter() public
     * javax.swing.table.TableStringConverter javax.swing.table.TableRowSorter.getStringConverter()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getStringConverter()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.table.TableRowSorter#setModel(javax.swing.table.TableModel) public void
     * javax.swing.table.TableRowSorter.setModel(javax.swing.table.TableModel)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setModel_TableModel()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.swing.table.TableRowSorter#setStringConverter(javax.swing.table.TableStringConverter) public void
     * javax.swing.table.TableRowSorter.setStringConverter(javax.swing.table.TableStringConverter)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setStringConverter_TableStringConverter()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
