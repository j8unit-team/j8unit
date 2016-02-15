package org.j8unit.repository.javax.sql.rowset;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.sql.rowset.CachedRowSet interface javax.sql.rowset.CachedRowSet}.
 * The complementary j8unit test interface containing the class relevant aspects is {@link CachedRowSetClassTests}.
 * </p>
 *
 * @see javax.sql.rowset.CachedRowSet interface javax.sql.rowset.CachedRowSet (the hereby targeted class-under-test
 *      class)
 * @see CachedRowSetClassTests CachedRowSetClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface CachedRowSetTests<SUT extends javax.sql.rowset.CachedRowSet>
extends org.j8unit.repository.javax.sql.RowSetTests<SUT>, JoinableTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.sql.rowset.CachedRowSet#toCollection() public abstract java.util.Collection
     * <?> javax.sql.rowset.CachedRowSet.toCollection() throws java.sql.SQLException}.
     *
     * <p>
     * Test method for {@link javax.sql.rowset.CachedRowSet#toCollection() public abstract java.util.Collection
     * javax.sql.rowset.CachedRowSet.toCollection() throws java.sql.SQLException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.sql.rowset.CachedRowSet#toCollection() public abstract java.util.Collection
     *      javax.sql.rowset.CachedRowSet.toCollection() throws java.sql.SQLException (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_toCollection()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.sql.rowset.CachedRowSet#toCollection(String) public abstract java.util.Collection
     * <?> javax.sql.rowset.CachedRowSet.toCollection(java.lang.String) throws java.sql.SQLException}.
     *
     * <p>
     * Test method for {@link javax.sql.rowset.CachedRowSet#toCollection(String) public abstract java.util.Collection
     * javax.sql.rowset.CachedRowSet.toCollection(java.lang.String) throws java.sql.SQLException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.sql.rowset.CachedRowSet#toCollection(String) public abstract java.util.Collection
     *      javax.sql.rowset.CachedRowSet.toCollection(java.lang.String) throws java.sql.SQLException (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_toCollection_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.sql.rowset.CachedRowSet#toCollection(int) public abstract java.util.Collection
     * <?> javax.sql.rowset.CachedRowSet.toCollection(int) throws java.sql.SQLException}.
     *
     * <p>
     * Test method for {@link javax.sql.rowset.CachedRowSet#toCollection(int) public abstract java.util.Collection
     * javax.sql.rowset.CachedRowSet.toCollection(int) throws java.sql.SQLException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.sql.rowset.CachedRowSet#toCollection(int) public abstract java.util.Collection
     *      javax.sql.rowset.CachedRowSet.toCollection(int) throws java.sql.SQLException (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_toCollection_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.sql.rowset.CachedRowSet#rowSetPopulated(javax.sql.RowSetEvent, int) public abstract
     * void javax.sql.rowset.CachedRowSet.rowSetPopulated(javax.sql.RowSetEvent,int) throws java.sql.SQLException}.
     *
     * <p>
     * Test method for {@link javax.sql.rowset.CachedRowSet#rowSetPopulated(javax.sql.RowSetEvent, int) public abstract
     * void javax.sql.rowset.CachedRowSet.rowSetPopulated(javax.sql.RowSetEvent,int) throws java.sql.SQLException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.sql.rowset.CachedRowSet#rowSetPopulated(javax.sql.RowSetEvent, int) public abstract void
     *      javax.sql.rowset.CachedRowSet.rowSetPopulated(javax.sql.RowSetEvent,int) throws java.sql.SQLException (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_rowSetPopulated_RowSetEvent_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.sql.rowset.CachedRowSet#setShowDeleted(boolean) public abstract void
     * javax.sql.rowset.CachedRowSet.setShowDeleted(boolean) throws java.sql.SQLException}.
     *
     * <p>
     * Test method for {@link javax.sql.rowset.CachedRowSet#setShowDeleted(boolean) public abstract void
     * javax.sql.rowset.CachedRowSet.setShowDeleted(boolean) throws java.sql.SQLException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.sql.rowset.CachedRowSet#setShowDeleted(boolean) public abstract void
     *      javax.sql.rowset.CachedRowSet.setShowDeleted(boolean) throws java.sql.SQLException (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setShowDeleted_boolean()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.sql.rowset.CachedRowSet#acceptChanges() public abstract void
     * javax.sql.rowset.CachedRowSet.acceptChanges() throws javax.sql.rowset.spi.SyncProviderException}.
     *
     * <p>
     * Test method for {@link javax.sql.rowset.CachedRowSet#acceptChanges() public abstract void
     * javax.sql.rowset.CachedRowSet.acceptChanges() throws javax.sql.rowset.spi.SyncProviderException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.sql.rowset.CachedRowSet#acceptChanges() public abstract void
     *      javax.sql.rowset.CachedRowSet.acceptChanges() throws javax.sql.rowset.spi.SyncProviderException (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_acceptChanges()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.sql.rowset.CachedRowSet#acceptChanges(java.sql.Connection) public abstract void
     * javax.sql.rowset.CachedRowSet.acceptChanges(java.sql.Connection) throws
     * javax.sql.rowset.spi.SyncProviderException}.
     *
     * <p>
     * Test method for {@link javax.sql.rowset.CachedRowSet#acceptChanges(java.sql.Connection) public abstract void
     * javax.sql.rowset.CachedRowSet.acceptChanges(java.sql.Connection) throws
     * javax.sql.rowset.spi.SyncProviderException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.sql.rowset.CachedRowSet#acceptChanges(java.sql.Connection) public abstract void
     *      javax.sql.rowset.CachedRowSet.acceptChanges(java.sql.Connection) throws
     *      javax.sql.rowset.spi.SyncProviderException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_acceptChanges_Connection()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.sql.rowset.CachedRowSet#setKeyColumns(int[]) public abstract void
     * javax.sql.rowset.CachedRowSet.setKeyColumns(int[]) throws java.sql.SQLException}.
     *
     * <p>
     * Test method for {@link javax.sql.rowset.CachedRowSet#setKeyColumns(int[]) public abstract void
     * javax.sql.rowset.CachedRowSet.setKeyColumns(int[]) throws java.sql.SQLException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.sql.rowset.CachedRowSet#setKeyColumns(int[]) public abstract void
     *      javax.sql.rowset.CachedRowSet.setKeyColumns(int[]) throws java.sql.SQLException (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setKeyColumns_intArray()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.sql.rowset.CachedRowSet#getOriginalRow() public abstract java.sql.ResultSet
     * javax.sql.rowset.CachedRowSet.getOriginalRow() throws java.sql.SQLException}.
     *
     * <p>
     * Test method for {@link javax.sql.rowset.CachedRowSet#getOriginalRow() public abstract java.sql.ResultSet
     * javax.sql.rowset.CachedRowSet.getOriginalRow() throws java.sql.SQLException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.sql.rowset.CachedRowSet#getOriginalRow() public abstract java.sql.ResultSet
     *      javax.sql.rowset.CachedRowSet.getOriginalRow() throws java.sql.SQLException (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getOriginalRow()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.sql.rowset.CachedRowSet#createShared() public abstract javax.sql.RowSet
     * javax.sql.rowset.CachedRowSet.createShared() throws java.sql.SQLException}.
     *
     * <p>
     * Test method for {@link javax.sql.rowset.CachedRowSet#createShared() public abstract javax.sql.RowSet
     * javax.sql.rowset.CachedRowSet.createShared() throws java.sql.SQLException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.sql.rowset.CachedRowSet#createShared() public abstract javax.sql.RowSet
     *      javax.sql.rowset.CachedRowSet.createShared() throws java.sql.SQLException (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_createShared()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.sql.rowset.CachedRowSet#release() public abstract void
     * javax.sql.rowset.CachedRowSet.release() throws java.sql.SQLException}.
     *
     * <p>
     * Test method for {@link javax.sql.rowset.CachedRowSet#release() public abstract void
     * javax.sql.rowset.CachedRowSet.release() throws java.sql.SQLException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.sql.rowset.CachedRowSet#release() public abstract void javax.sql.rowset.CachedRowSet.release() throws
     *      java.sql.SQLException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_release()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.sql.rowset.CachedRowSet#nextPage() public abstract boolean
     * javax.sql.rowset.CachedRowSet.nextPage() throws java.sql.SQLException}.
     *
     * <p>
     * Test method for {@link javax.sql.rowset.CachedRowSet#nextPage() public abstract boolean
     * javax.sql.rowset.CachedRowSet.nextPage() throws java.sql.SQLException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.sql.rowset.CachedRowSet#nextPage() public abstract boolean javax.sql.rowset.CachedRowSet.nextPage()
     *      throws java.sql.SQLException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_nextPage()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.sql.rowset.CachedRowSet#getShowDeleted() public abstract boolean
     * javax.sql.rowset.CachedRowSet.getShowDeleted() throws java.sql.SQLException}.
     *
     * <p>
     * Test method for {@link javax.sql.rowset.CachedRowSet#getShowDeleted() public abstract boolean
     * javax.sql.rowset.CachedRowSet.getShowDeleted() throws java.sql.SQLException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.sql.rowset.CachedRowSet#getShowDeleted() public abstract boolean
     *      javax.sql.rowset.CachedRowSet.getShowDeleted() throws java.sql.SQLException (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getShowDeleted()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.sql.rowset.CachedRowSet#createCopy() public abstract javax.sql.rowset.CachedRowSet
     * javax.sql.rowset.CachedRowSet.createCopy() throws java.sql.SQLException}.
     *
     * <p>
     * Test method for {@link javax.sql.rowset.CachedRowSet#createCopy() public abstract javax.sql.rowset.CachedRowSet
     * javax.sql.rowset.CachedRowSet.createCopy() throws java.sql.SQLException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.sql.rowset.CachedRowSet#createCopy() public abstract javax.sql.rowset.CachedRowSet
     *      javax.sql.rowset.CachedRowSet.createCopy() throws java.sql.SQLException (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_createCopy()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.sql.rowset.CachedRowSet#restoreOriginal() public abstract void
     * javax.sql.rowset.CachedRowSet.restoreOriginal() throws java.sql.SQLException}.
     *
     * <p>
     * Test method for {@link javax.sql.rowset.CachedRowSet#restoreOriginal() public abstract void
     * javax.sql.rowset.CachedRowSet.restoreOriginal() throws java.sql.SQLException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.sql.rowset.CachedRowSet#restoreOriginal() public abstract void
     *      javax.sql.rowset.CachedRowSet.restoreOriginal() throws java.sql.SQLException (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_restoreOriginal()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.sql.rowset.CachedRowSet#previousPage() public abstract boolean
     * javax.sql.rowset.CachedRowSet.previousPage() throws java.sql.SQLException}.
     *
     * <p>
     * Test method for {@link javax.sql.rowset.CachedRowSet#previousPage() public abstract boolean
     * javax.sql.rowset.CachedRowSet.previousPage() throws java.sql.SQLException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.sql.rowset.CachedRowSet#previousPage() public abstract boolean
     *      javax.sql.rowset.CachedRowSet.previousPage() throws java.sql.SQLException (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_previousPage()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.sql.rowset.CachedRowSet#getKeyColumns() public abstract int[]
     * javax.sql.rowset.CachedRowSet.getKeyColumns() throws java.sql.SQLException}.
     *
     * <p>
     * Test method for {@link javax.sql.rowset.CachedRowSet#getKeyColumns() public abstract int[]
     * javax.sql.rowset.CachedRowSet.getKeyColumns() throws java.sql.SQLException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.sql.rowset.CachedRowSet#getKeyColumns() public abstract int[]
     *      javax.sql.rowset.CachedRowSet.getKeyColumns() throws java.sql.SQLException (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getKeyColumns()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.sql.rowset.CachedRowSet#setTableName(String) public abstract void
     * javax.sql.rowset.CachedRowSet.setTableName(java.lang.String) throws java.sql.SQLException}.
     *
     * <p>
     * Test method for {@link javax.sql.rowset.CachedRowSet#setTableName(String) public abstract void
     * javax.sql.rowset.CachedRowSet.setTableName(java.lang.String) throws java.sql.SQLException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.sql.rowset.CachedRowSet#setTableName(String) public abstract void
     *      javax.sql.rowset.CachedRowSet.setTableName(java.lang.String) throws java.sql.SQLException (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setTableName_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.sql.rowset.CachedRowSet#getOriginal() public abstract java.sql.ResultSet
     * javax.sql.rowset.CachedRowSet.getOriginal() throws java.sql.SQLException}.
     *
     * <p>
     * Test method for {@link javax.sql.rowset.CachedRowSet#getOriginal() public abstract java.sql.ResultSet
     * javax.sql.rowset.CachedRowSet.getOriginal() throws java.sql.SQLException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.sql.rowset.CachedRowSet#getOriginal() public abstract java.sql.ResultSet
     *      javax.sql.rowset.CachedRowSet.getOriginal() throws java.sql.SQLException (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getOriginal()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.sql.rowset.CachedRowSet#setSyncProvider(String) public abstract void
     * javax.sql.rowset.CachedRowSet.setSyncProvider(java.lang.String) throws java.sql.SQLException}.
     *
     * <p>
     * Test method for {@link javax.sql.rowset.CachedRowSet#setSyncProvider(String) public abstract void
     * javax.sql.rowset.CachedRowSet.setSyncProvider(java.lang.String) throws java.sql.SQLException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.sql.rowset.CachedRowSet#setSyncProvider(String) public abstract void
     *      javax.sql.rowset.CachedRowSet.setSyncProvider(java.lang.String) throws java.sql.SQLException (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setSyncProvider_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.sql.rowset.CachedRowSet#commit() public abstract void
     * javax.sql.rowset.CachedRowSet.commit() throws java.sql.SQLException}.
     *
     * <p>
     * Test method for {@link javax.sql.rowset.CachedRowSet#commit() public abstract void
     * javax.sql.rowset.CachedRowSet.commit() throws java.sql.SQLException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.sql.rowset.CachedRowSet#commit() public abstract void javax.sql.rowset.CachedRowSet.commit() throws
     *      java.sql.SQLException (the hereby targeted method-under-test)
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

    /**
     * <p>
     * Test method for {@link javax.sql.rowset.CachedRowSet#setOriginalRow() public abstract void
     * javax.sql.rowset.CachedRowSet.setOriginalRow() throws java.sql.SQLException}.
     *
     * <p>
     * Test method for {@link javax.sql.rowset.CachedRowSet#setOriginalRow() public abstract void
     * javax.sql.rowset.CachedRowSet.setOriginalRow() throws java.sql.SQLException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.sql.rowset.CachedRowSet#setOriginalRow() public abstract void
     *      javax.sql.rowset.CachedRowSet.setOriginalRow() throws java.sql.SQLException (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setOriginalRow()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.sql.rowset.CachedRowSet#size() public abstract int
     * javax.sql.rowset.CachedRowSet.size()}.
     *
     * <p>
     * Test method for {@link javax.sql.rowset.CachedRowSet#size() public abstract int
     * javax.sql.rowset.CachedRowSet.size()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.sql.rowset.CachedRowSet#size() public abstract int javax.sql.rowset.CachedRowSet.size() (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_size()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.sql.rowset.CachedRowSet#populate(java.sql.ResultSet) public abstract void
     * javax.sql.rowset.CachedRowSet.populate(java.sql.ResultSet) throws java.sql.SQLException}.
     *
     * <p>
     * Test method for {@link javax.sql.rowset.CachedRowSet#populate(java.sql.ResultSet) public abstract void
     * javax.sql.rowset.CachedRowSet.populate(java.sql.ResultSet) throws java.sql.SQLException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.sql.rowset.CachedRowSet#populate(java.sql.ResultSet) public abstract void
     *      javax.sql.rowset.CachedRowSet.populate(java.sql.ResultSet) throws java.sql.SQLException (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_populate_ResultSet()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.sql.rowset.CachedRowSet#populate(java.sql.ResultSet, int) public abstract void
     * javax.sql.rowset.CachedRowSet.populate(java.sql.ResultSet,int) throws java.sql.SQLException}.
     *
     * <p>
     * Test method for {@link javax.sql.rowset.CachedRowSet#populate(java.sql.ResultSet, int) public abstract void
     * javax.sql.rowset.CachedRowSet.populate(java.sql.ResultSet,int) throws java.sql.SQLException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.sql.rowset.CachedRowSet#populate(java.sql.ResultSet, int) public abstract void
     *      javax.sql.rowset.CachedRowSet.populate(java.sql.ResultSet,int) throws java.sql.SQLException (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_populate_ResultSet_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.sql.rowset.CachedRowSet#getPageSize() public abstract int
     * javax.sql.rowset.CachedRowSet.getPageSize()}.
     *
     * <p>
     * Test method for {@link javax.sql.rowset.CachedRowSet#getPageSize() public abstract int
     * javax.sql.rowset.CachedRowSet.getPageSize()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.sql.rowset.CachedRowSet#getPageSize() public abstract int javax.sql.rowset.CachedRowSet.getPageSize()
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getPageSize()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.sql.rowset.CachedRowSet#getRowSetWarnings() public abstract
     * javax.sql.rowset.RowSetWarning javax.sql.rowset.CachedRowSet.getRowSetWarnings() throws java.sql.SQLException}.
     *
     * <p>
     * Test method for {@link javax.sql.rowset.CachedRowSet#getRowSetWarnings() public abstract
     * javax.sql.rowset.RowSetWarning javax.sql.rowset.CachedRowSet.getRowSetWarnings() throws java.sql.SQLException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.sql.rowset.CachedRowSet#getRowSetWarnings() public abstract javax.sql.rowset.RowSetWarning
     *      javax.sql.rowset.CachedRowSet.getRowSetWarnings() throws java.sql.SQLException (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getRowSetWarnings()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.sql.rowset.CachedRowSet#getSyncProvider() public abstract
     * javax.sql.rowset.spi.SyncProvider javax.sql.rowset.CachedRowSet.getSyncProvider() throws java.sql.SQLException}.
     *
     * <p>
     * Test method for {@link javax.sql.rowset.CachedRowSet#getSyncProvider() public abstract
     * javax.sql.rowset.spi.SyncProvider javax.sql.rowset.CachedRowSet.getSyncProvider() throws java.sql.SQLException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.sql.rowset.CachedRowSet#getSyncProvider() public abstract javax.sql.rowset.spi.SyncProvider
     *      javax.sql.rowset.CachedRowSet.getSyncProvider() throws java.sql.SQLException (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getSyncProvider()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.sql.rowset.CachedRowSet#setPageSize(int) public abstract void
     * javax.sql.rowset.CachedRowSet.setPageSize(int) throws java.sql.SQLException}.
     *
     * <p>
     * Test method for {@link javax.sql.rowset.CachedRowSet#setPageSize(int) public abstract void
     * javax.sql.rowset.CachedRowSet.setPageSize(int) throws java.sql.SQLException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.sql.rowset.CachedRowSet#setPageSize(int) public abstract void
     *      javax.sql.rowset.CachedRowSet.setPageSize(int) throws java.sql.SQLException (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setPageSize_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.sql.rowset.CachedRowSet#getTableName() public abstract java.lang.String
     * javax.sql.rowset.CachedRowSet.getTableName() throws java.sql.SQLException}.
     *
     * <p>
     * Test method for {@link javax.sql.rowset.CachedRowSet#getTableName() public abstract java.lang.String
     * javax.sql.rowset.CachedRowSet.getTableName() throws java.sql.SQLException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.sql.rowset.CachedRowSet#getTableName() public abstract java.lang.String
     *      javax.sql.rowset.CachedRowSet.getTableName() throws java.sql.SQLException (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getTableName()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.sql.rowset.CachedRowSet#columnUpdated(int) public abstract boolean
     * javax.sql.rowset.CachedRowSet.columnUpdated(int) throws java.sql.SQLException}.
     *
     * <p>
     * Test method for {@link javax.sql.rowset.CachedRowSet#columnUpdated(int) public abstract boolean
     * javax.sql.rowset.CachedRowSet.columnUpdated(int) throws java.sql.SQLException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.sql.rowset.CachedRowSet#columnUpdated(int) public abstract boolean
     *      javax.sql.rowset.CachedRowSet.columnUpdated(int) throws java.sql.SQLException (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_columnUpdated_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.sql.rowset.CachedRowSet#columnUpdated(String) public abstract boolean
     * javax.sql.rowset.CachedRowSet.columnUpdated(java.lang.String) throws java.sql.SQLException}.
     *
     * <p>
     * Test method for {@link javax.sql.rowset.CachedRowSet#columnUpdated(String) public abstract boolean
     * javax.sql.rowset.CachedRowSet.columnUpdated(java.lang.String) throws java.sql.SQLException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.sql.rowset.CachedRowSet#columnUpdated(String) public abstract boolean
     *      javax.sql.rowset.CachedRowSet.columnUpdated(java.lang.String) throws java.sql.SQLException (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_columnUpdated_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.sql.rowset.CachedRowSet#undoDelete() public abstract void
     * javax.sql.rowset.CachedRowSet.undoDelete() throws java.sql.SQLException}.
     *
     * <p>
     * Test method for {@link javax.sql.rowset.CachedRowSet#undoDelete() public abstract void
     * javax.sql.rowset.CachedRowSet.undoDelete() throws java.sql.SQLException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.sql.rowset.CachedRowSet#undoDelete() public abstract void javax.sql.rowset.CachedRowSet.undoDelete()
     *      throws java.sql.SQLException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_undoDelete()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.sql.rowset.CachedRowSet#rollback(java.sql.Savepoint) public abstract void
     * javax.sql.rowset.CachedRowSet.rollback(java.sql.Savepoint) throws java.sql.SQLException}.
     *
     * <p>
     * Test method for {@link javax.sql.rowset.CachedRowSet#rollback(java.sql.Savepoint) public abstract void
     * javax.sql.rowset.CachedRowSet.rollback(java.sql.Savepoint) throws java.sql.SQLException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.sql.rowset.CachedRowSet#rollback(java.sql.Savepoint) public abstract void
     *      javax.sql.rowset.CachedRowSet.rollback(java.sql.Savepoint) throws java.sql.SQLException (the hereby targeted
     *      method-under-test)
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
     * Test method for {@link javax.sql.rowset.CachedRowSet#rollback() public abstract void
     * javax.sql.rowset.CachedRowSet.rollback() throws java.sql.SQLException}.
     *
     * <p>
     * Test method for {@link javax.sql.rowset.CachedRowSet#rollback() public abstract void
     * javax.sql.rowset.CachedRowSet.rollback() throws java.sql.SQLException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.sql.rowset.CachedRowSet#rollback() public abstract void javax.sql.rowset.CachedRowSet.rollback()
     *      throws java.sql.SQLException (the hereby targeted method-under-test)
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
     * Test method for {@link javax.sql.rowset.CachedRowSet#setMetaData(javax.sql.RowSetMetaData) public abstract void
     * javax.sql.rowset.CachedRowSet.setMetaData(javax.sql.RowSetMetaData) throws java.sql.SQLException}.
     *
     * <p>
     * Test method for {@link javax.sql.rowset.CachedRowSet#setMetaData(javax.sql.RowSetMetaData) public abstract void
     * javax.sql.rowset.CachedRowSet.setMetaData(javax.sql.RowSetMetaData) throws java.sql.SQLException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.sql.rowset.CachedRowSet#setMetaData(javax.sql.RowSetMetaData) public abstract void
     *      javax.sql.rowset.CachedRowSet.setMetaData(javax.sql.RowSetMetaData) throws java.sql.SQLException (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setMetaData_RowSetMetaData()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.sql.rowset.CachedRowSet#execute(java.sql.Connection) public abstract void
     * javax.sql.rowset.CachedRowSet.execute(java.sql.Connection) throws java.sql.SQLException}.
     *
     * <p>
     * Test method for {@link javax.sql.rowset.CachedRowSet#execute(java.sql.Connection) public abstract void
     * javax.sql.rowset.CachedRowSet.execute(java.sql.Connection) throws java.sql.SQLException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.sql.rowset.CachedRowSet#execute(java.sql.Connection) public abstract void
     *      javax.sql.rowset.CachedRowSet.execute(java.sql.Connection) throws java.sql.SQLException (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_execute_Connection()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.sql.rowset.CachedRowSet#createCopyNoConstraints() public abstract
     * javax.sql.rowset.CachedRowSet javax.sql.rowset.CachedRowSet.createCopyNoConstraints() throws
     * java.sql.SQLException}.
     *
     * <p>
     * Test method for {@link javax.sql.rowset.CachedRowSet#createCopyNoConstraints() public abstract
     * javax.sql.rowset.CachedRowSet javax.sql.rowset.CachedRowSet.createCopyNoConstraints() throws
     * java.sql.SQLException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.sql.rowset.CachedRowSet#createCopyNoConstraints() public abstract javax.sql.rowset.CachedRowSet
     *      javax.sql.rowset.CachedRowSet.createCopyNoConstraints() throws java.sql.SQLException (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_createCopyNoConstraints()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.sql.rowset.CachedRowSet#createCopySchema() public abstract
     * javax.sql.rowset.CachedRowSet javax.sql.rowset.CachedRowSet.createCopySchema() throws java.sql.SQLException}.
     *
     * <p>
     * Test method for {@link javax.sql.rowset.CachedRowSet#createCopySchema() public abstract
     * javax.sql.rowset.CachedRowSet javax.sql.rowset.CachedRowSet.createCopySchema() throws java.sql.SQLException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.sql.rowset.CachedRowSet#createCopySchema() public abstract javax.sql.rowset.CachedRowSet
     *      javax.sql.rowset.CachedRowSet.createCopySchema() throws java.sql.SQLException (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_createCopySchema()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.sql.rowset.CachedRowSet#undoUpdate() public abstract void
     * javax.sql.rowset.CachedRowSet.undoUpdate() throws java.sql.SQLException}.
     *
     * <p>
     * Test method for {@link javax.sql.rowset.CachedRowSet#undoUpdate() public abstract void
     * javax.sql.rowset.CachedRowSet.undoUpdate() throws java.sql.SQLException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.sql.rowset.CachedRowSet#undoUpdate() public abstract void javax.sql.rowset.CachedRowSet.undoUpdate()
     *      throws java.sql.SQLException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_undoUpdate()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.sql.rowset.CachedRowSet#undoInsert() public abstract void
     * javax.sql.rowset.CachedRowSet.undoInsert() throws java.sql.SQLException}.
     *
     * <p>
     * Test method for {@link javax.sql.rowset.CachedRowSet#undoInsert() public abstract void
     * javax.sql.rowset.CachedRowSet.undoInsert() throws java.sql.SQLException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.sql.rowset.CachedRowSet#undoInsert() public abstract void javax.sql.rowset.CachedRowSet.undoInsert()
     *      throws java.sql.SQLException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_undoInsert()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
