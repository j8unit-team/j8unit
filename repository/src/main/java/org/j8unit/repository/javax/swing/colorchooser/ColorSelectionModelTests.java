package org.j8unit.repository.javax.swing.colorchooser;

import org.j8unit.repository.RepositoryTests;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.swing.colorchooser.ColorSelectionModel interface
 * javax.swing.colorchooser.ColorSelectionModel}, containing all instance relevant test methods (i.&thinsp;e., test
 * methods of non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test
 * methods is {@link org.j8unit.repository.javax.swing.colorchooser.ColorSelectionModelTests}.
 * </p>
 *
 * @see org.j8unit.repository.javax.swing.colorchooser.ColorSelectionModelClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.swing.colorchooser.ColorSelectionModel
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ColorSelectionModelTests<SUT extends javax.swing.colorchooser.ColorSelectionModel>
extends RepositoryTests<SUT> {

    /**
     * <p>
     * Test method for
     * {@link javax.swing.colorchooser.ColorSelectionModel#addChangeListener(javax.swing.event.ChangeListener) public
     * abstract void javax.swing.colorchooser.ColorSelectionModel.addChangeListener(javax.swing.event.ChangeListener)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.colorchooser.ColorSelectionModel#addChangeListener(javax.swing.event.ChangeListener)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_addChangeListener_ChangeListener()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.colorchooser.ColorSelectionModel#getSelectedColor() public abstract
     * java.awt.Color javax.swing.colorchooser.ColorSelectionModel.getSelectedColor()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.colorchooser.ColorSelectionModel#getSelectedColor()
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getSelectedColor()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.swing.colorchooser.ColorSelectionModel#removeChangeListener(javax.swing.event.ChangeListener) public
     * abstract void
     * javax.swing.colorchooser.ColorSelectionModel.removeChangeListener(javax.swing.event.ChangeListener)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.colorchooser.ColorSelectionModel#removeChangeListener(javax.swing.event.ChangeListener)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
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
     * Test method for {@link javax.swing.colorchooser.ColorSelectionModel#setSelectedColor(java.awt.Color) public
     * abstract void javax.swing.colorchooser.ColorSelectionModel.setSelectedColor(java.awt.Color)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.colorchooser.ColorSelectionModel#setSelectedColor(java.awt.Color)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setSelectedColor_Color()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
