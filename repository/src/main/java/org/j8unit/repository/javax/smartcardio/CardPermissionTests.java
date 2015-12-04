package org.j8unit.repository.javax.smartcardio;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.smartcardio.CardPermission class javax.smartcardio.CardPermission}, containing all
 * instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.smartcardio.CardPermissionClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface CardPermissionTests<SUT extends javax.smartcardio.CardPermission>
extends org.j8unit.repository.java.security.PermissionTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.smartcardio.CardPermission#hashCode() public int
     * javax.smartcardio.CardPermission.hashCode()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_hashCode()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.smartcardio.CardPermission#equals(java.lang.Object) public boolean
     * javax.smartcardio.CardPermission.equals(java.lang.Object)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_equals_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.smartcardio.CardPermission#getActions() public java.lang.String
     * javax.smartcardio.CardPermission.getActions()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_getActions()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.smartcardio.CardPermission#implies(java.security.Permission) public boolean
     * javax.smartcardio.CardPermission.implies(java.security.Permission)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_implies_Permission()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
