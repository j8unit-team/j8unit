package org.j8unit.repository.java.security.acl;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.security.acl.Group interface java.security.acl.Group}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link GroupClassTests}.
 * </p>
 *
 * @see java.security.acl.Group interface java.security.acl.Group (the hereby targeted class-under-test class)
 * @see GroupClassTests GroupClassTests (the complementary j8unit test interface containing the class relevant test
 *      methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface GroupTests<SUT extends java.security.acl.Group>
extends org.j8unit.repository.java.security.PrincipalTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.security.acl.Group#members() public abstract java.util.Enumeration<? extends
     * java.security.Principal> java.security.acl.Group.members()}.
     *
     * <p>
     * Test method for {@link java.security.acl.Group#members() public abstract java.util.Enumeration
     * java.security.acl.Group.members()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.acl.Group#members() public abstract java.util.Enumeration java.security.acl.Group.members()
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_members()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.acl.Group#removeMember(java.security.Principal) public abstract boolean
     * java.security.acl.Group.removeMember(java.security.Principal)}.
     *
     * <p>
     * Test method for {@link java.security.acl.Group#removeMember(java.security.Principal) public abstract boolean
     * java.security.acl.Group.removeMember(java.security.Principal)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.acl.Group#removeMember(java.security.Principal) public abstract boolean
     *      java.security.acl.Group.removeMember(java.security.Principal) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_removeMember_Principal()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.acl.Group#addMember(java.security.Principal) public abstract boolean
     * java.security.acl.Group.addMember(java.security.Principal)}.
     *
     * <p>
     * Test method for {@link java.security.acl.Group#addMember(java.security.Principal) public abstract boolean
     * java.security.acl.Group.addMember(java.security.Principal)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.acl.Group#addMember(java.security.Principal) public abstract boolean
     *      java.security.acl.Group.addMember(java.security.Principal) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_addMember_Principal()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.acl.Group#isMember(java.security.Principal) public abstract boolean
     * java.security.acl.Group.isMember(java.security.Principal)}.
     *
     * <p>
     * Test method for {@link java.security.acl.Group#isMember(java.security.Principal) public abstract boolean
     * java.security.acl.Group.isMember(java.security.Principal)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.acl.Group#isMember(java.security.Principal) public abstract boolean
     *      java.security.acl.Group.isMember(java.security.Principal) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_isMember_Principal()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
