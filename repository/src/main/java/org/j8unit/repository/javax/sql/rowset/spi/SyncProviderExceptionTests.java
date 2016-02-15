package org.j8unit.repository.javax.sql.rowset.spi;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.sql.rowset.spi.SyncProviderException class
 * javax.sql.rowset.spi.SyncProviderException}. The complementary j8unit test interface containing the class relevant
 * aspects is {@link SyncProviderExceptionClassTests}.
 * </p>
 *
 * @see javax.sql.rowset.spi.SyncProviderException class javax.sql.rowset.spi.SyncProviderException (the hereby targeted
 *      class-under-test class)
 * @see SyncProviderExceptionClassTests SyncProviderExceptionClassTests (the complementary j8unit test interface
 *      containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface SyncProviderExceptionTests<SUT extends javax.sql.rowset.spi.SyncProviderException>
extends org.j8unit.repository.java.sql.SQLExceptionTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.sql.rowset.spi.SyncProviderException#getSyncResolver() public
     * javax.sql.rowset.spi.SyncResolver javax.sql.rowset.spi.SyncProviderException.getSyncResolver()}.
     *
     * <p>
     * Test method for {@link javax.sql.rowset.spi.SyncProviderException#getSyncResolver() public
     * javax.sql.rowset.spi.SyncResolver javax.sql.rowset.spi.SyncProviderException.getSyncResolver()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.sql.rowset.spi.SyncProviderException#getSyncResolver() public javax.sql.rowset.spi.SyncResolver
     *      javax.sql.rowset.spi.SyncProviderException.getSyncResolver() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getSyncResolver()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.sql.rowset.spi.SyncProviderException#setSyncResolver(javax.sql.rowset.spi.SyncResolver) public void
     * javax.sql.rowset.spi.SyncProviderException.setSyncResolver(javax.sql.rowset.spi.SyncResolver)}.
     *
     * <p>
     * Test method for
     * {@link javax.sql.rowset.spi.SyncProviderException#setSyncResolver(javax.sql.rowset.spi.SyncResolver) public void
     * javax.sql.rowset.spi.SyncProviderException.setSyncResolver(javax.sql.rowset.spi.SyncResolver)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.sql.rowset.spi.SyncProviderException#setSyncResolver(javax.sql.rowset.spi.SyncResolver) public void
     *      javax.sql.rowset.spi.SyncProviderException.setSyncResolver(javax.sql.rowset.spi.SyncResolver) (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setSyncResolver_SyncResolver()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
