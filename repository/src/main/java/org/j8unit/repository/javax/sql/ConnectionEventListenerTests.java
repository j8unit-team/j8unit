package org.j8unit.repository.javax.sql;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.sql.ConnectionEventListener interface
 * javax.sql.ConnectionEventListener}, containing all instance relevant test methods (i.&thinsp;e., test methods of non-
 * {@code static} methods). The counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.javax.sql.ConnectionEventListenerTests}.
 * </p>
 *
 * @see org.j8unit.repository.javax.sql.ConnectionEventListenerClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.sql.ConnectionEventListener
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ConnectionEventListenerTests<SUT extends javax.sql.ConnectionEventListener>
extends org.j8unit.repository.java.util.EventListenerTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.sql.ConnectionEventListener#connectionClosed(javax.sql.ConnectionEvent) public
     * abstract void javax.sql.ConnectionEventListener.connectionClosed(javax.sql.ConnectionEvent)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.sql.ConnectionEventListener#connectionClosed(javax.sql.ConnectionEvent)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_connectionClosed_ConnectionEvent()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.sql.ConnectionEventListener#connectionErrorOccurred(javax.sql.ConnectionEvent)
     * public abstract void javax.sql.ConnectionEventListener.connectionErrorOccurred(javax.sql.ConnectionEvent)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.sql.ConnectionEventListener#connectionErrorOccurred(javax.sql.ConnectionEvent)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_connectionErrorOccurred_ConnectionEvent()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
