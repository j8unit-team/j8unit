package org.j8unit.repository.javax.naming.ldap;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.naming.ldap.PagedResultsResponseControl class
 * javax.naming.ldap.PagedResultsResponseControl}, containing all instance relevant test methods (i.&thinsp;e., test
 * methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.naming.ldap.PagedResultsResponseControlClassTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface PagedResultsResponseControlTests<SUT extends javax.naming.ldap.PagedResultsResponseControl>
extends org.j8unit.repository.javax.naming.ldap.BasicControlTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.naming.ldap.PagedResultsResponseControl#getCookie() public byte[]
     * javax.naming.ldap.PagedResultsResponseControl.getCookie()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getCookie()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.naming.ldap.PagedResultsResponseControl#getResultSize() public int
     * javax.naming.ldap.PagedResultsResponseControl.getResultSize()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getResultSize()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
