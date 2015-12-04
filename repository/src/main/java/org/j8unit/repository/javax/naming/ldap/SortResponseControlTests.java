package org.j8unit.repository.javax.naming.ldap;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.naming.ldap.SortResponseControl class javax.naming.ldap.SortResponseControl}, containing
 * all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.naming.ldap.SortResponseControlClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface SortResponseControlTests<SUT extends javax.naming.ldap.SortResponseControl>
extends org.j8unit.repository.javax.naming.ldap.BasicControlTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.naming.ldap.SortResponseControl#isSorted() public boolean
     * javax.naming.ldap.SortResponseControl.isSorted()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_isSorted()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.naming.ldap.SortResponseControl#getAttributeID() public java.lang.String
     * javax.naming.ldap.SortResponseControl.getAttributeID()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getAttributeID()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.naming.ldap.SortResponseControl#getResultCode() public int
     * javax.naming.ldap.SortResponseControl.getResultCode()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getResultCode()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.naming.ldap.SortResponseControl#getException() public javax.naming.NamingException
     * javax.naming.ldap.SortResponseControl.getException()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getException()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
