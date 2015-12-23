package org.j8unit.repository.javax.naming.ldap;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.naming.ldap.PagedResultsResponseControl class
 * javax.naming.ldap.PagedResultsResponseControl}, containing all instance relevant test methods (i.&thinsp;e., test
 * methods of non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test
 * methods is {@link org.j8unit.repository.javax.naming.ldap.PagedResultsResponseControlTests}.
 * </p>
 *
 * @see org.j8unit.repository.javax.naming.ldap.PagedResultsResponseControlClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.naming.ldap.PagedResultsResponseControl
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface PagedResultsResponseControlTests<SUT extends javax.naming.ldap.PagedResultsResponseControl>
extends org.j8unit.repository.javax.naming.ldap.BasicControlTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.naming.ldap.PagedResultsResponseControl#getCookie() public byte[]
     * javax.naming.ldap.PagedResultsResponseControl.getCookie()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.naming.ldap.PagedResultsResponseControl#getCookie()
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
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.naming.ldap.PagedResultsResponseControl#getResultSize()
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
