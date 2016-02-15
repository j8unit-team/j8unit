package org.j8unit.repository.java.security.acl;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.security.acl.Acl interface java.security.acl.Acl}. The complementary
 * j8unit test interface containing the class relevant aspects is {@link AclClassTests}.
 * </p>
 *
 * @see java.security.acl.Acl interface java.security.acl.Acl (the hereby targeted class-under-test class)
 * @see AclClassTests AclClassTests (the complementary j8unit test interface containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface AclTests<SUT extends java.security.acl.Acl>
extends OwnerTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.security.acl.Acl#toString() public abstract java.lang.String
     * java.security.acl.Acl.toString()}.
     *
     * <p>
     * Test method for {@link java.security.acl.Acl#toString() public abstract java.lang.String
     * java.security.acl.Acl.toString()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.acl.Acl#toString() public abstract java.lang.String java.security.acl.Acl.toString() (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_toString()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.acl.Acl#entries() public abstract java.util.Enumeration
     * <java.security.acl.AclEntry> java.security.acl.Acl.entries()}.
     *
     * <p>
     * Test method for {@link java.security.acl.Acl#entries() public abstract java.util.Enumeration
     * java.security.acl.Acl.entries()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.acl.Acl#entries() public abstract java.util.Enumeration java.security.acl.Acl.entries() (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_entries()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.acl.Acl#getName() public abstract java.lang.String
     * java.security.acl.Acl.getName()}.
     *
     * <p>
     * Test method for {@link java.security.acl.Acl#getName() public abstract java.lang.String
     * java.security.acl.Acl.getName()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.acl.Acl#getName() public abstract java.lang.String java.security.acl.Acl.getName() (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getName()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.acl.Acl#setName(java.security.Principal, String) public abstract void
     * java.security.acl.Acl.setName(java.security.Principal,java.lang.String) throws
     * java.security.acl.NotOwnerException}.
     *
     * <p>
     * Test method for {@link java.security.acl.Acl#setName(java.security.Principal, String) public abstract void
     * java.security.acl.Acl.setName(java.security.Principal,java.lang.String) throws
     * java.security.acl.NotOwnerException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.acl.Acl#setName(java.security.Principal, String) public abstract void
     *      java.security.acl.Acl.setName(java.security.Principal,java.lang.String) throws
     *      java.security.acl.NotOwnerException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setName_Principal_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.security.acl.Acl#checkPermission(java.security.Principal, java.security.acl.Permission) public
     * abstract boolean java.security.acl.Acl.checkPermission(java.security.Principal,java.security.acl.Permission)}.
     *
     * <p>
     * Test method for
     * {@link java.security.acl.Acl#checkPermission(java.security.Principal, java.security.acl.Permission) public
     * abstract boolean java.security.acl.Acl.checkPermission(java.security.Principal,java.security.acl.Permission)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.acl.Acl#checkPermission(java.security.Principal, java.security.acl.Permission) public abstract
     *      boolean java.security.acl.Acl.checkPermission(java.security.Principal,java.security.acl.Permission) (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_checkPermission_Principal_Permission()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.acl.Acl#removeEntry(java.security.Principal, java.security.acl.AclEntry)
     * public abstract boolean java.security.acl.Acl.removeEntry(java.security.Principal,java.security.acl.AclEntry)
     * throws java.security.acl.NotOwnerException}.
     *
     * <p>
     * Test method for {@link java.security.acl.Acl#removeEntry(java.security.Principal, java.security.acl.AclEntry)
     * public abstract boolean java.security.acl.Acl.removeEntry(java.security.Principal,java.security.acl.AclEntry)
     * throws java.security.acl.NotOwnerException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.acl.Acl#removeEntry(java.security.Principal, java.security.acl.AclEntry) public abstract
     *      boolean java.security.acl.Acl.removeEntry(java.security.Principal,java.security.acl.AclEntry) throws
     *      java.security.acl.NotOwnerException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_removeEntry_Principal_AclEntry()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.acl.Acl#getPermissions(java.security.Principal) public abstract
     * java.util.Enumeration
     * <java.security.acl.Permission> java.security.acl.Acl.getPermissions(java.security.Principal)}.
     *
     * <p>
     * Test method for {@link java.security.acl.Acl#getPermissions(java.security.Principal) public abstract
     * java.util.Enumeration java.security.acl.Acl.getPermissions(java.security.Principal)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.acl.Acl#getPermissions(java.security.Principal) public abstract java.util.Enumeration
     *      java.security.acl.Acl.getPermissions(java.security.Principal) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getPermissions_Principal()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.acl.Acl#addEntry(java.security.Principal, java.security.acl.AclEntry) public
     * abstract boolean java.security.acl.Acl.addEntry(java.security.Principal,java.security.acl.AclEntry) throws
     * java.security.acl.NotOwnerException}.
     *
     * <p>
     * Test method for {@link java.security.acl.Acl#addEntry(java.security.Principal, java.security.acl.AclEntry) public
     * abstract boolean java.security.acl.Acl.addEntry(java.security.Principal,java.security.acl.AclEntry) throws
     * java.security.acl.NotOwnerException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.acl.Acl#addEntry(java.security.Principal, java.security.acl.AclEntry) public abstract boolean
     *      java.security.acl.Acl.addEntry(java.security.Principal,java.security.acl.AclEntry) throws
     *      java.security.acl.NotOwnerException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_addEntry_Principal_AclEntry()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
