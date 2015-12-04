package org.j8unit.repository.javax.sql.rowset.spi;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.sql.rowset.spi.SyncProviderException class javax.sql.rowset.spi.SyncProviderException},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.sql.rowset.spi.SyncProviderExceptionClassTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface SyncProviderExceptionTests<SUT extends javax.sql.rowset.spi.SyncProviderException>
extends org.j8unit.repository.java.sql.SQLExceptionTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.sql.rowset.spi.SyncProviderException#getSyncResolver() public
     * javax.sql.rowset.spi.SyncResolver javax.sql.rowset.spi.SyncProviderException.getSyncResolver()}.
     * </p>
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
     * </p>
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
