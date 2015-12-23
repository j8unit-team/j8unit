package org.j8unit.repository.javax.naming.event;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.naming.event.NamingListener interface
 * javax.naming.event.NamingListener}, containing all instance relevant test methods (i.&thinsp;e., test methods of non-
 * {@code static} methods). The counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.javax.naming.event.NamingListenerTests}.
 * </p>
 *
 * @see org.j8unit.repository.javax.naming.event.NamingListenerClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.naming.event.NamingListener
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface NamingListenerTests<SUT extends javax.naming.event.NamingListener>
extends org.j8unit.repository.java.util.EventListenerTests<SUT> {

    /**
     * <p>
     * Test method for
     * {@link javax.naming.event.NamingListener#namingExceptionThrown(javax.naming.event.NamingExceptionEvent) public
     * abstract void javax.naming.event.NamingListener.namingExceptionThrown(javax.naming.event.NamingExceptionEvent)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.naming.event.NamingListener#namingExceptionThrown(javax.naming.event.NamingExceptionEvent)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_namingExceptionThrown_NamingExceptionEvent()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
