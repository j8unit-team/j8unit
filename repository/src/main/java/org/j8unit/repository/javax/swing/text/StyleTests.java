package org.j8unit.repository.javax.swing.text;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.swing.text.Style interface javax.swing.text.Style}, containing all instance relevant test
 * methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.swing.text.StyleClassTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface StyleTests<SUT extends javax.swing.text.Style>
extends org.j8unit.repository.javax.swing.text.MutableAttributeSetTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.swing.text.Style#addChangeListener(javax.swing.event.ChangeListener) public abstract
     * void javax.swing.text.Style.addChangeListener(javax.swing.event.ChangeListener)}.
     * </p>
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
     * Test method for {@link javax.swing.text.Style#getName() public abstract java.lang.String
     * javax.swing.text.Style.getName()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getName()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.text.Style#removeChangeListener(javax.swing.event.ChangeListener) public
     * abstract void javax.swing.text.Style.removeChangeListener(javax.swing.event.ChangeListener)}.
     * </p>
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

}
