package org.j8unit.repository.javax.swing.event;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.swing.event.SwingPropertyChangeSupport class
 * javax.swing.event.SwingPropertyChangeSupport}, containing all instance relevant test methods (i.&thinsp;e., test
 * methods of non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test
 * methods is {@link org.j8unit.repository.javax.swing.event.SwingPropertyChangeSupportTests}.
 * </p>
 *
 * @see org.j8unit.repository.javax.swing.event.SwingPropertyChangeSupportClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.swing.event.SwingPropertyChangeSupport
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
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.event.SwingPropertyChangeSupport#firePropertyChange(java.beans.PropertyChangeEvent)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
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
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.event.SwingPropertyChangeSupport#isNotifyOnEDT()
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
