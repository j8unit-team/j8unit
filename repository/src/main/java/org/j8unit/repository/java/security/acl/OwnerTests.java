package org.j8unit.repository.java.security.acl;

import org.j8unit.J8UnitTest;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link java.security.acl.Owner interface java.security.acl.Owner}, containing all instance relevant
 * test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.security.acl.OwnerClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface OwnerTests<SUT extends java.security.acl.Owner>
extends J8UnitTest<SUT> {

    /**
     * <p>
     * Test method for {@link java.security.acl.Owner#deleteOwner(java.security.Principal,java.security.Principal)
     * public abstract boolean java.security.acl.Owner.deleteOwner(java.security.Principal,java.security.Principal)
     * throws java.security.acl.NotOwnerException,java.security.acl.LastOwnerException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_deleteOwner_Principal_Principal()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.acl.Owner#isOwner(java.security.Principal) public abstract boolean
     * java.security.acl.Owner.isOwner(java.security.Principal)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_isOwner_Principal()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.acl.Owner#addOwner(java.security.Principal,java.security.Principal) public
     * abstract boolean java.security.acl.Owner.addOwner(java.security.Principal,java.security.Principal) throws
     * java.security.acl.NotOwnerException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_addOwner_Principal_Principal()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
