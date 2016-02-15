package org.j8unit.repository.javax.sql;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.sql.ConnectionEventListener interface
 * javax.sql.ConnectionEventListener}. The complementary j8unit test interface containing the class relevant aspects is
 * {@link ConnectionEventListenerClassTests}.
 * </p>
 *
 * @see javax.sql.ConnectionEventListener interface javax.sql.ConnectionEventListener (the hereby targeted
 *      class-under-test class)
 * @see ConnectionEventListenerClassTests ConnectionEventListenerClassTests (the complementary j8unit test interface
 *      containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
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
     * <p>
     * Test method for {@link javax.sql.ConnectionEventListener#connectionClosed(javax.sql.ConnectionEvent) public
     * abstract void javax.sql.ConnectionEventListener.connectionClosed(javax.sql.ConnectionEvent)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.sql.ConnectionEventListener#connectionClosed(javax.sql.ConnectionEvent) public abstract void
     *      javax.sql.ConnectionEventListener.connectionClosed(javax.sql.ConnectionEvent) (the hereby targeted
     *      method-under-test)
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
     * <p>
     * Test method for {@link javax.sql.ConnectionEventListener#connectionErrorOccurred(javax.sql.ConnectionEvent)
     * public abstract void javax.sql.ConnectionEventListener.connectionErrorOccurred(javax.sql.ConnectionEvent)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.sql.ConnectionEventListener#connectionErrorOccurred(javax.sql.ConnectionEvent) public abstract void
     *      javax.sql.ConnectionEventListener.connectionErrorOccurred(javax.sql.ConnectionEvent) (the hereby targeted
     *      method-under-test)
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
