package org.j8unit.repository.javax.swing.event;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.swing.event.RowSorterEvent class javax.swing.event.RowSorterEvent}, containing all
 * instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.swing.event.RowSorterEventClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface RowSorterEventTests<SUT extends javax.swing.event.RowSorterEvent>
extends org.j8unit.repository.java.util.EventObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.swing.event.RowSorterEvent#convertPreviousRowIndexToModel(int) public int
     * javax.swing.event.RowSorterEvent.convertPreviousRowIndexToModel(int)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_convertPreviousRowIndexToModel_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.event.RowSorterEvent#getType() public javax.swing.event.RowSorterEvent$Type
     * javax.swing.event.RowSorterEvent.getType()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getType()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.event.RowSorterEvent#getSource() public javax.swing.RowSorter
     * javax.swing.event.RowSorterEvent.getSource()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_getSource()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.event.RowSorterEvent#getPreviousRowCount() public int
     * javax.swing.event.RowSorterEvent.getPreviousRowCount()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getPreviousRowCount()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test class for {@link javax.swing.event.RowSorterEvent$Type class javax.swing.event.RowSorterEvent$Type},
     * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
     * </p>
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     * @see org.j8unit.repository.javax.swing.event.RowSorterEventClassTests.TypeClassTests
     */
    @Category(J8UnitRepository.class)
    public static abstract interface TypeTests<SUT extends javax.swing.event.RowSorterEvent.Type>
    extends org.j8unit.repository.java.lang.EnumTests<SUT, javax.swing.event.RowSorterEvent.Type> {

    }

}
