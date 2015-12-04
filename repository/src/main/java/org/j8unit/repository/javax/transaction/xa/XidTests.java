package org.j8unit.repository.javax.transaction.xa;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link javax.transaction.xa.Xid interface javax.transaction.xa.Xid},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.transaction.xa.XidClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface XidTests<SUT extends javax.transaction.xa.Xid>
extends J8UnitTest<SUT>
{

    /**
     * <p>
     * Test method for {@link javax.transaction.xa.Xid#getBranchQualifier() public abstract byte[] javax.transaction.xa.Xid.getBranchQualifier()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getBranchQualifier() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.transaction.xa.Xid#getFormatId() public abstract int javax.transaction.xa.Xid.getFormatId()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getFormatId() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.transaction.xa.Xid#getGlobalTransactionId() public abstract byte[] javax.transaction.xa.Xid.getGlobalTransactionId()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getGlobalTransactionId() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
