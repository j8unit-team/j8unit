package org.j8unit.repository.javax.sql.rowset.spi;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.sql.rowset.spi.SyncResolver interface javax.sql.rowset.spi.SyncResolver}, containing all
 * instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.sql.rowset.spi.SyncResolverClassTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface SyncResolverTests<SUT extends javax.sql.rowset.spi.SyncResolver>
extends org.j8unit.repository.javax.sql.RowSetTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.sql.rowset.spi.SyncResolver#getConflictValue(int) public abstract java.lang.Object
     * javax.sql.rowset.spi.SyncResolver.getConflictValue(int) throws java.sql.SQLException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getConflictValue_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.sql.rowset.spi.SyncResolver#getConflictValue(java.lang.String) public abstract
     * java.lang.Object javax.sql.rowset.spi.SyncResolver.getConflictValue(java.lang.String) throws
     * java.sql.SQLException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getConflictValue_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.sql.rowset.spi.SyncResolver#getStatus() public abstract int
     * javax.sql.rowset.spi.SyncResolver.getStatus()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getStatus()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.sql.rowset.spi.SyncResolver#nextConflict() public abstract boolean
     * javax.sql.rowset.spi.SyncResolver.nextConflict() throws java.sql.SQLException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_nextConflict()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.sql.rowset.spi.SyncResolver#previousConflict() public abstract boolean
     * javax.sql.rowset.spi.SyncResolver.previousConflict() throws java.sql.SQLException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_previousConflict()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.sql.rowset.spi.SyncResolver#setResolvedValue(int,java.lang.Object) public abstract
     * void javax.sql.rowset.spi.SyncResolver.setResolvedValue(int,java.lang.Object) throws java.sql.SQLException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setResolvedValue_int_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.sql.rowset.spi.SyncResolver#setResolvedValue(java.lang.String,java.lang.Object)
     * public abstract void javax.sql.rowset.spi.SyncResolver.setResolvedValue(java.lang.String,java.lang.Object) throws
     * java.sql.SQLException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setResolvedValue_String_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
