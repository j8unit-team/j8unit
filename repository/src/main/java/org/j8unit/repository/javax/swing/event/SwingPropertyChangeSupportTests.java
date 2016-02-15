package org.j8unit.repository.javax.swing.event;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.swing.event.SwingPropertyChangeSupport class
 * javax.swing.event.SwingPropertyChangeSupport}. The complementary j8unit test interface containing the class relevant
 * aspects is {@link SwingPropertyChangeSupportClassTests}.
 * </p>
 *
 * @see javax.swing.event.SwingPropertyChangeSupport class javax.swing.event.SwingPropertyChangeSupport (the hereby
 *      targeted class-under-test class)
 * @see SwingPropertyChangeSupportClassTests SwingPropertyChangeSupportClassTests (the complementary j8unit test
 *      interface containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface SwingPropertyChangeSupportTests<SUT extends javax.swing.event.SwingPropertyChangeSupport>
extends org.j8unit.repository.java.beans.PropertyChangeSupportTests<SUT> {

    /**
     * <p>
     * Test method for
     * {@link javax.swing.event.SwingPropertyChangeSupport#firePropertyChange(java.beans.PropertyChangeEvent) public
     * void javax.swing.event.SwingPropertyChangeSupport.firePropertyChange(java.beans.PropertyChangeEvent)}.
     *
     * <p>
     * Test method for
     * {@link javax.swing.event.SwingPropertyChangeSupport#firePropertyChange(java.beans.PropertyChangeEvent) public
     * void javax.swing.event.SwingPropertyChangeSupport.firePropertyChange(java.beans.PropertyChangeEvent)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.event.SwingPropertyChangeSupport#firePropertyChange(java.beans.PropertyChangeEvent) public void
     *      javax.swing.event.SwingPropertyChangeSupport.firePropertyChange(java.beans.PropertyChangeEvent) (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_firePropertyChange_PropertyChangeEvent()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.event.SwingPropertyChangeSupport#isNotifyOnEDT() public final boolean
     * javax.swing.event.SwingPropertyChangeSupport.isNotifyOnEDT()}.
     *
     * <p>
     * Test method for {@link javax.swing.event.SwingPropertyChangeSupport#isNotifyOnEDT() public final boolean
     * javax.swing.event.SwingPropertyChangeSupport.isNotifyOnEDT()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.event.SwingPropertyChangeSupport#isNotifyOnEDT() public final boolean
     *      javax.swing.event.SwingPropertyChangeSupport.isNotifyOnEDT() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_isNotifyOnEDT()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
