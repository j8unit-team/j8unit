package org.j8unit.repository.java.beans;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain java.beans.VetoableChangeListenerProxy class
 * java.beans.VetoableChangeListenerProxy}, containing all instance relevant test methods (i.&thinsp;e., test methods of
 * non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.java.beans.VetoableChangeListenerProxyTests}.
 * </p>
 *
 * @see org.j8unit.repository.java.beans.VetoableChangeListenerProxyClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim java.beans.VetoableChangeListenerProxy
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface VetoableChangeListenerProxyTests<SUT extends java.beans.VetoableChangeListenerProxy>
extends org.j8unit.repository.java.beans.VetoableChangeListenerTests<SUT>,
org.j8unit.repository.java.util.EventListenerProxyTests<SUT, java.beans.VetoableChangeListener> {

    /**
     * <p>
     * Test method for {@link java.beans.VetoableChangeListenerProxy#getPropertyName() public java.lang.String
     * java.beans.VetoableChangeListenerProxy.getPropertyName()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.beans.VetoableChangeListenerProxy#getPropertyName()
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getPropertyName()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.beans.VetoableChangeListenerProxy#vetoableChange(java.beans.PropertyChangeEvent)
     * public void java.beans.VetoableChangeListenerProxy.vetoableChange(java.beans.PropertyChangeEvent) throws
     * java.beans.PropertyVetoException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.beans.VetoableChangeListenerProxy#vetoableChange(java.beans.PropertyChangeEvent)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_vetoableChange_PropertyChangeEvent()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
