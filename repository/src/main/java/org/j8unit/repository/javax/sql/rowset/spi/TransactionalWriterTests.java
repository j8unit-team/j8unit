package org.j8unit.repository.javax.sql.rowset.spi;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.sql.rowset.spi.TransactionalWriter interface
 * javax.sql.rowset.spi.TransactionalWriter}. The complementary j8unit test interface containing the class relevant
 * aspects is {@link TransactionalWriterClassTests}.
 * </p>
 *
 * @see javax.sql.rowset.spi.TransactionalWriter interface javax.sql.rowset.spi.TransactionalWriter (the hereby targeted
 *      class-under-test class)
 * @see TransactionalWriterClassTests TransactionalWriterClassTests (the complementary j8unit test interface containing
 *      the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface TransactionalWriterTests<SUT extends javax.sql.rowset.spi.TransactionalWriter>
extends org.j8unit.repository.javax.sql.RowSetWriterTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.sql.rowset.spi.TransactionalWriter#rollback() public abstract void
     * javax.sql.rowset.spi.TransactionalWriter.rollback() throws java.sql.SQLException}.
     *
     * <p>
     * Test method for {@link javax.sql.rowset.spi.TransactionalWriter#rollback() public abstract void
     * javax.sql.rowset.spi.TransactionalWriter.rollback() throws java.sql.SQLException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.sql.rowset.spi.TransactionalWriter#rollback() public abstract void
     *      javax.sql.rowset.spi.TransactionalWriter.rollback() throws java.sql.SQLException (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_rollback()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.sql.rowset.spi.TransactionalWriter#rollback(java.sql.Savepoint) public abstract void
     * javax.sql.rowset.spi.TransactionalWriter.rollback(java.sql.Savepoint) throws java.sql.SQLException}.
     *
     * <p>
     * Test method for {@link javax.sql.rowset.spi.TransactionalWriter#rollback(java.sql.Savepoint) public abstract void
     * javax.sql.rowset.spi.TransactionalWriter.rollback(java.sql.Savepoint) throws java.sql.SQLException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.sql.rowset.spi.TransactionalWriter#rollback(java.sql.Savepoint) public abstract void
     *      javax.sql.rowset.spi.TransactionalWriter.rollback(java.sql.Savepoint) throws java.sql.SQLException (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_rollback_Savepoint()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.sql.rowset.spi.TransactionalWriter#commit() public abstract void
     * javax.sql.rowset.spi.TransactionalWriter.commit() throws java.sql.SQLException}.
     *
     * <p>
     * Test method for {@link javax.sql.rowset.spi.TransactionalWriter#commit() public abstract void
     * javax.sql.rowset.spi.TransactionalWriter.commit() throws java.sql.SQLException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.sql.rowset.spi.TransactionalWriter#commit() public abstract void
     *      javax.sql.rowset.spi.TransactionalWriter.commit() throws java.sql.SQLException (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_commit()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
