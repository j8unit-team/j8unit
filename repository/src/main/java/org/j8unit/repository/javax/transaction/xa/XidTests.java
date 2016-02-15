package org.j8unit.repository.javax.transaction.xa;

import org.j8unit.repository.RepositoryTests;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.transaction.xa.Xid interface javax.transaction.xa.Xid}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link XidClassTests}.
 * </p>
 *
 * @see javax.transaction.xa.Xid interface javax.transaction.xa.Xid (the hereby targeted class-under-test class)
 * @see XidClassTests XidClassTests (the complementary j8unit test interface containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface XidTests<SUT extends javax.transaction.xa.Xid>
extends RepositoryTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.transaction.xa.Xid#getBranchQualifier() public abstract byte[]
     * javax.transaction.xa.Xid.getBranchQualifier()}.
     *
     * <p>
     * Test method for {@link javax.transaction.xa.Xid#getBranchQualifier() public abstract byte[]
     * javax.transaction.xa.Xid.getBranchQualifier()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.transaction.xa.Xid#getBranchQualifier() public abstract byte[]
     *      javax.transaction.xa.Xid.getBranchQualifier() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getBranchQualifier()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.transaction.xa.Xid#getFormatId() public abstract int
     * javax.transaction.xa.Xid.getFormatId()}.
     *
     * <p>
     * Test method for {@link javax.transaction.xa.Xid#getFormatId() public abstract int
     * javax.transaction.xa.Xid.getFormatId()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.transaction.xa.Xid#getFormatId() public abstract int javax.transaction.xa.Xid.getFormatId() (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getFormatId()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.transaction.xa.Xid#getGlobalTransactionId() public abstract byte[]
     * javax.transaction.xa.Xid.getGlobalTransactionId()}.
     *
     * <p>
     * Test method for {@link javax.transaction.xa.Xid#getGlobalTransactionId() public abstract byte[]
     * javax.transaction.xa.Xid.getGlobalTransactionId()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.transaction.xa.Xid#getGlobalTransactionId() public abstract byte[]
     *      javax.transaction.xa.Xid.getGlobalTransactionId() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getGlobalTransactionId()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
