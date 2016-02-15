package org.j8unit.repository.javax.swing;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.swing.DefaultSingleSelectionModel class
 * javax.swing.DefaultSingleSelectionModel}. The complementary j8unit test interface containing the class relevant
 * aspects is {@link DefaultSingleSelectionModelClassTests}.
 * </p>
 *
 * @see javax.swing.DefaultSingleSelectionModel class javax.swing.DefaultSingleSelectionModel (the hereby targeted
 *      class-under-test class)
 * @see DefaultSingleSelectionModelClassTests DefaultSingleSelectionModelClassTests (the complementary j8unit test
 *      interface containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface DefaultSingleSelectionModelTests<SUT extends javax.swing.DefaultSingleSelectionModel>
extends SingleSelectionModelTests<SUT>, org.j8unit.repository.java.io.SerializableTests<SUT>, org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.swing.DefaultSingleSelectionModel#getChangeListeners() public
     * javax.swing.event.ChangeListener[] javax.swing.DefaultSingleSelectionModel.getChangeListeners()}.
     *
     * <p>
     * Test method for {@link javax.swing.DefaultSingleSelectionModel#getChangeListeners() public
     * javax.swing.event.ChangeListener[] javax.swing.DefaultSingleSelectionModel.getChangeListeners()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.DefaultSingleSelectionModel#getChangeListeners() public javax.swing.event.ChangeListener[]
     *      javax.swing.DefaultSingleSelectionModel.getChangeListeners() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getChangeListeners()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.swing.DefaultSingleSelectionModel#removeChangeListener(javax.swing.event.ChangeListener) public void
     * javax.swing.DefaultSingleSelectionModel.removeChangeListener(javax.swing.event.ChangeListener)}.
     *
     * <p>
     * Test method for
     * {@link javax.swing.DefaultSingleSelectionModel#removeChangeListener(javax.swing.event.ChangeListener) public void
     * javax.swing.DefaultSingleSelectionModel.removeChangeListener(javax.swing.event.ChangeListener)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.DefaultSingleSelectionModel#removeChangeListener(javax.swing.event.ChangeListener) public void
     *      javax.swing.DefaultSingleSelectionModel.removeChangeListener(javax.swing.event.ChangeListener) (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_removeChangeListener_ChangeListener()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.DefaultSingleSelectionModel#getListeners(Class) public <T> T[]
     * javax.swing.DefaultSingleSelectionModel.getListeners(java.lang.Class<T>)}.
     *
     * <p>
     * Test method for {@link javax.swing.DefaultSingleSelectionModel#getListeners(Class) public
     * java.util.EventListener[] javax.swing.DefaultSingleSelectionModel.getListeners(java.lang.Class)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.DefaultSingleSelectionModel#getListeners(Class) public java.util.EventListener[]
     *      javax.swing.DefaultSingleSelectionModel.getListeners(java.lang.Class) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getListeners_Class()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.DefaultSingleSelectionModel#clearSelection() public void
     * javax.swing.DefaultSingleSelectionModel.clearSelection()}.
     *
     * <p>
     * Test method for {@link javax.swing.DefaultSingleSelectionModel#clearSelection() public void
     * javax.swing.DefaultSingleSelectionModel.clearSelection()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.DefaultSingleSelectionModel#clearSelection() public void
     *      javax.swing.DefaultSingleSelectionModel.clearSelection() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_clearSelection()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.DefaultSingleSelectionModel#setSelectedIndex(int) public void
     * javax.swing.DefaultSingleSelectionModel.setSelectedIndex(int)}.
     *
     * <p>
     * Test method for {@link javax.swing.DefaultSingleSelectionModel#setSelectedIndex(int) public void
     * javax.swing.DefaultSingleSelectionModel.setSelectedIndex(int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.DefaultSingleSelectionModel#setSelectedIndex(int) public void
     *      javax.swing.DefaultSingleSelectionModel.setSelectedIndex(int) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_setSelectedIndex_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.DefaultSingleSelectionModel#isSelected() public boolean
     * javax.swing.DefaultSingleSelectionModel.isSelected()}.
     *
     * <p>
     * Test method for {@link javax.swing.DefaultSingleSelectionModel#isSelected() public boolean
     * javax.swing.DefaultSingleSelectionModel.isSelected()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.DefaultSingleSelectionModel#isSelected() public boolean
     *      javax.swing.DefaultSingleSelectionModel.isSelected() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_isSelected()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.DefaultSingleSelectionModel#getSelectedIndex() public int
     * javax.swing.DefaultSingleSelectionModel.getSelectedIndex()}.
     *
     * <p>
     * Test method for {@link javax.swing.DefaultSingleSelectionModel#getSelectedIndex() public int
     * javax.swing.DefaultSingleSelectionModel.getSelectedIndex()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.DefaultSingleSelectionModel#getSelectedIndex() public int
     *      javax.swing.DefaultSingleSelectionModel.getSelectedIndex() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getSelectedIndex()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.swing.DefaultSingleSelectionModel#addChangeListener(javax.swing.event.ChangeListener) public void
     * javax.swing.DefaultSingleSelectionModel.addChangeListener(javax.swing.event.ChangeListener)}.
     *
     * <p>
     * Test method for
     * {@link javax.swing.DefaultSingleSelectionModel#addChangeListener(javax.swing.event.ChangeListener) public void
     * javax.swing.DefaultSingleSelectionModel.addChangeListener(javax.swing.event.ChangeListener)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.DefaultSingleSelectionModel#addChangeListener(javax.swing.event.ChangeListener) public void
     *      javax.swing.DefaultSingleSelectionModel.addChangeListener(javax.swing.event.ChangeListener) (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_addChangeListener_ChangeListener()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
