package org.j8unit.repository.javax.sql.rowset.spi;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link javax.sql.rowset.spi.TransactionalWriter interface javax.sql.rowset.spi.TransactionalWriter},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.sql.rowset.spi.TransactionalWriterClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface TransactionalWriterTests<SUT extends javax.sql.rowset.spi.TransactionalWriter>
extends org.j8unit.repository.javax.sql.RowSetWriterTests<SUT>
{

    /**
     * <p>
     * Test method for {@link javax.sql.rowset.spi.TransactionalWriter#rollback() public abstract void javax.sql.rowset.spi.TransactionalWriter.rollback() throws java.sql.SQLException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_rollback() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.sql.rowset.spi.TransactionalWriter#rollback(java.sql.Savepoint) public abstract void javax.sql.rowset.spi.TransactionalWriter.rollback(java.sql.Savepoint) throws java.sql.SQLException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_rollback_Savepoint() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.sql.rowset.spi.TransactionalWriter#commit() public abstract void javax.sql.rowset.spi.TransactionalWriter.commit() throws java.sql.SQLException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_commit() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
