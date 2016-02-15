package org.j8unit.repository.java.security.acl;

import org.j8unit.repository.RepositoryTests;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.security.acl.Owner interface java.security.acl.Owner}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link OwnerClassTests}.
 * </p>
 *
 * @see java.security.acl.Owner interface java.security.acl.Owner (the hereby targeted class-under-test class)
 * @see OwnerClassTests OwnerClassTests (the complementary j8unit test interface containing the class relevant test
 *      methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface OwnerTests<SUT extends java.security.acl.Owner>
extends RepositoryTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.security.acl.Owner#deleteOwner(java.security.Principal, java.security.Principal)
     * public abstract boolean java.security.acl.Owner.deleteOwner(java.security.Principal,java.security.Principal)
     * throws java.security.acl.NotOwnerException,java.security.acl.LastOwnerException}.
     *
     * <p>
     * Test method for {@link java.security.acl.Owner#deleteOwner(java.security.Principal, java.security.Principal)
     * public abstract boolean java.security.acl.Owner.deleteOwner(java.security.Principal,java.security.Principal)
     * throws java.security.acl.NotOwnerException,java.security.acl.LastOwnerException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.acl.Owner#deleteOwner(java.security.Principal, java.security.Principal) public abstract
     *      boolean java.security.acl.Owner.deleteOwner(java.security.Principal,java.security.Principal) throws
     *      java.security.acl.NotOwnerException,java.security.acl.LastOwnerException (the hereby targeted
     *      method-under-test)
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
     *
     * <p>
     * Test method for {@link java.security.acl.Owner#isOwner(java.security.Principal) public abstract boolean
     * java.security.acl.Owner.isOwner(java.security.Principal)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.acl.Owner#isOwner(java.security.Principal) public abstract boolean
     *      java.security.acl.Owner.isOwner(java.security.Principal) (the hereby targeted method-under-test)
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
     * Test method for {@link java.security.acl.Owner#addOwner(java.security.Principal, java.security.Principal) public
     * abstract boolean java.security.acl.Owner.addOwner(java.security.Principal,java.security.Principal) throws
     * java.security.acl.NotOwnerException}.
     *
     * <p>
     * Test method for {@link java.security.acl.Owner#addOwner(java.security.Principal, java.security.Principal) public
     * abstract boolean java.security.acl.Owner.addOwner(java.security.Principal,java.security.Principal) throws
     * java.security.acl.NotOwnerException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.acl.Owner#addOwner(java.security.Principal, java.security.Principal) public abstract boolean
     *      java.security.acl.Owner.addOwner(java.security.Principal,java.security.Principal) throws
     *      java.security.acl.NotOwnerException (the hereby targeted method-under-test)
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
