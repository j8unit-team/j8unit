package org.j8unit.repository.javax.naming.event;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.naming.event.NamespaceChangeListener interface
 * javax.naming.event.NamespaceChangeListener}, containing all instance relevant test methods (i.&thinsp;e., test
 * methods of non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test
 * methods is {@link org.j8unit.repository.javax.naming.event.NamespaceChangeListenerTests}.
 * </p>
 *
 * @see org.j8unit.repository.javax.naming.event.NamespaceChangeListenerClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.naming.event.NamespaceChangeListener
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface NamespaceChangeListenerTests<SUT extends javax.naming.event.NamespaceChangeListener>
extends org.j8unit.repository.javax.naming.event.NamingListenerTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.naming.event.NamespaceChangeListener#objectAdded(javax.naming.event.NamingEvent)
     * public abstract void javax.naming.event.NamespaceChangeListener.objectAdded(javax.naming.event.NamingEvent)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.naming.event.NamespaceChangeListener#objectAdded(javax.naming.event.NamingEvent)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_objectAdded_NamingEvent()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.naming.event.NamespaceChangeListener#objectRemoved(javax.naming.event.NamingEvent)
     * public abstract void javax.naming.event.NamespaceChangeListener.objectRemoved(javax.naming.event.NamingEvent)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.naming.event.NamespaceChangeListener#objectRemoved(javax.naming.event.NamingEvent)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_objectRemoved_NamingEvent()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.naming.event.NamespaceChangeListener#objectRenamed(javax.naming.event.NamingEvent)
     * public abstract void javax.naming.event.NamespaceChangeListener.objectRenamed(javax.naming.event.NamingEvent)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.naming.event.NamespaceChangeListener#objectRenamed(javax.naming.event.NamingEvent)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_objectRenamed_NamingEvent()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
