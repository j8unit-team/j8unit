package org.j8unit.repository.java.security.acl;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link java.security.acl.Acl interface java.security.acl.Acl}, containing all instance relevant test
 * methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.security.acl.AclClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface AclTests<SUT extends java.security.acl.Acl>
extends org.j8unit.repository.java.security.acl.OwnerTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.security.acl.Acl#toString() public abstract java.lang.String
     * java.security.acl.Acl.toString()}.
     * </p>
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
     * java.security.acl.Acl.entries()}.
     * </p>
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
     * </p>
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
     * Test method for {@link java.security.acl.Acl#setName(java.security.Principal,java.lang.String) public abstract
     * void java.security.acl.Acl.setName(java.security.Principal,java.lang.String) throws
     * java.security.acl.NotOwnerException}.
     * </p>
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
     * {@link java.security.acl.Acl#checkPermission(java.security.Principal,java.security.acl.Permission) public
     * abstract boolean java.security.acl.Acl.checkPermission(java.security.Principal,java.security.acl.Permission)}.
     * </p>
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
     * Test method for {@link java.security.acl.Acl#removeEntry(java.security.Principal,java.security.acl.AclEntry)
     * public abstract boolean java.security.acl.Acl.removeEntry(java.security.Principal,java.security.acl.AclEntry)
     * throws java.security.acl.NotOwnerException}.
     * </p>
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
     * java.util.Enumeration java.security.acl.Acl.getPermissions(java.security.Principal)}.
     * </p>
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
     * Test method for {@link java.security.acl.Acl#addEntry(java.security.Principal,java.security.acl.AclEntry) public
     * abstract boolean java.security.acl.Acl.addEntry(java.security.Principal,java.security.acl.AclEntry) throws
     * java.security.acl.NotOwnerException}.
     * </p>
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
