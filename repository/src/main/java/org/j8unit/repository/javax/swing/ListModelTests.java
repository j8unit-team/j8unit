package org.j8unit.repository.javax.swing;

import org.j8unit.J8UnitTest;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.swing.ListModel interface javax.swing.ListModel}, containing all instance relevant test
 * methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.swing.ListModelClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface ListModelTests<SUT extends javax.swing.ListModel<E>, E>
extends J8UnitTest<SUT> {

    /**
     * <p>
     * Test method for {@link javax.swing.ListModel#getElementAt(int) public abstract java.lang.Object
     * javax.swing.ListModel.getElementAt(int)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getElementAt_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.ListModel#addListDataListener(javax.swing.event.ListDataListener) public
     * abstract void javax.swing.ListModel.addListDataListener(javax.swing.event.ListDataListener)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_addListDataListener_ListDataListener()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.ListModel#getSize() public abstract int javax.swing.ListModel.getSize()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getSize()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.ListModel#removeListDataListener(javax.swing.event.ListDataListener) public
     * abstract void javax.swing.ListModel.removeListDataListener(javax.swing.event.ListDataListener)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_removeListDataListener_ListDataListener()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
