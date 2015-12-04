package org.j8unit.repository.java.beans;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link java.beans.VetoableChangeListener interface java.beans.VetoableChangeListener}, containing all
 * instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.beans.VetoableChangeListenerClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface VetoableChangeListenerTests<SUT extends java.beans.VetoableChangeListener>
extends org.j8unit.repository.java.util.EventListenerTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.beans.VetoableChangeListener#vetoableChange(java.beans.PropertyChangeEvent) public
     * abstract void java.beans.VetoableChangeListener.vetoableChange(java.beans.PropertyChangeEvent) throws
     * java.beans.PropertyVetoException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_vetoableChange_PropertyChangeEvent()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
