package org.j8unit.repository.java.security;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link java.security.Permissions class java.security.Permissions}, containing all instance relevant
 * test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.security.PermissionsClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface PermissionsTests<SUT extends java.security.Permissions>
extends org.j8unit.repository.java.io.SerializableTests<SUT>, org.j8unit.repository.java.security.PermissionCollectionTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.security.Permissions#implies(java.security.Permission) public boolean
     * java.security.Permissions.implies(java.security.Permission)}.
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

    /**
     * <p>
     * Test method for {@link java.security.Permissions#elements() public java.util.Enumeration
     * java.security.Permissions.elements()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_elements()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.Permissions#add(java.security.Permission) public void
     * java.security.Permissions.add(java.security.Permission)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_add_Permission()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
