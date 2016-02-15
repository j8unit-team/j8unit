package org.j8unit.repository.javax.swing.table;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.swing.table.TableRowSorter class javax.swing.table.TableRowSorter}.
 * The complementary j8unit test interface containing the class relevant aspects is {@link TableRowSorterClassTests}.
 * </p>
 *
 * @see javax.swing.table.TableRowSorter class javax.swing.table.TableRowSorter (the hereby targeted class-under-test
 *      class)
 * @see TableRowSorterClassTests TableRowSorterClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface TableRowSorterTests<SUT extends javax.swing.table.TableRowSorter<M>, M extends javax.swing.table.TableModel>
extends org.j8unit.repository.javax.swing.DefaultRowSorterTests<SUT, M, Integer> {

    /**
     * <p>
     * Test method for {@link javax.swing.table.TableRowSorter#setModel(javax.swing.table.TableModel) public void
     * javax.swing.table.TableRowSorter.setModel(M)}.
     *
     * <p>
     * Test method for {@link javax.swing.table.TableRowSorter#setModel(javax.swing.table.TableModel) public void
     * javax.swing.table.TableRowSorter.setModel(javax.swing.table.TableModel)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.table.TableRowSorter#setModel(javax.swing.table.TableModel) public void
     *      javax.swing.table.TableRowSorter.setModel(javax.swing.table.TableModel) (the hereby targeted
     *      method-under-test)
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
     * Test method for {@link javax.swing.table.TableRowSorter#getStringConverter() public
     * javax.swing.table.TableStringConverter javax.swing.table.TableRowSorter.getStringConverter()}.
     *
     * <p>
     * Test method for {@link javax.swing.table.TableRowSorter#getStringConverter() public
     * javax.swing.table.TableStringConverter javax.swing.table.TableRowSorter.getStringConverter()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.table.TableRowSorter#getStringConverter() public javax.swing.table.TableStringConverter
     *      javax.swing.table.TableRowSorter.getStringConverter() (the hereby targeted method-under-test)
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
     * Test method for {@link javax.swing.table.TableRowSorter#getComparator(int) public java.util.Comparator
     * <?> javax.swing.table.TableRowSorter.getComparator(int)}.
     *
     * <p>
     * Test method for {@link javax.swing.table.TableRowSorter#getComparator(int) public java.util.Comparator
     * javax.swing.table.TableRowSorter.getComparator(int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.table.TableRowSorter#getComparator(int) public java.util.Comparator
     *      javax.swing.table.TableRowSorter.getComparator(int) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getComparator_int()
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
     *
     * <p>
     * Test method for
     * {@link javax.swing.table.TableRowSorter#setStringConverter(javax.swing.table.TableStringConverter) public void
     * javax.swing.table.TableRowSorter.setStringConverter(javax.swing.table.TableStringConverter)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.table.TableRowSorter#setStringConverter(javax.swing.table.TableStringConverter) public void
     *      javax.swing.table.TableRowSorter.setStringConverter(javax.swing.table.TableStringConverter) (the hereby
     *      targeted method-under-test)
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
