package org.j8unit.repository.javax.sql;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.sql.ConnectionEvent class javax.sql.ConnectionEvent}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link ConnectionEventClassTests}.
 * </p>
 *
 * @see javax.sql.ConnectionEvent class javax.sql.ConnectionEvent (the hereby targeted class-under-test class)
 * @see ConnectionEventClassTests ConnectionEventClassTests (the complementary j8unit test interface containing the
 *      class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ConnectionEventTests<SUT extends javax.sql.ConnectionEvent>
extends org.j8unit.repository.java.util.EventObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.sql.ConnectionEvent#getSQLException() public java.sql.SQLException
     * javax.sql.ConnectionEvent.getSQLException()}.
     *
     * <p>
     * Test method for {@link javax.sql.ConnectionEvent#getSQLException() public java.sql.SQLException
     * javax.sql.ConnectionEvent.getSQLException()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.sql.ConnectionEvent#getSQLException() public java.sql.SQLException
     *      javax.sql.ConnectionEvent.getSQLException() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getSQLException()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
