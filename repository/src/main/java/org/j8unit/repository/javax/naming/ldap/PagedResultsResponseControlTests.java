package org.j8unit.repository.javax.naming.ldap;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.naming.ldap.PagedResultsResponseControl class
 * javax.naming.ldap.PagedResultsResponseControl}. The complementary j8unit test interface containing the class relevant
 * aspects is {@link PagedResultsResponseControlClassTests}.
 * </p>
 *
 * @see javax.naming.ldap.PagedResultsResponseControl class javax.naming.ldap.PagedResultsResponseControl (the hereby
 *      targeted class-under-test class)
 * @see PagedResultsResponseControlClassTests PagedResultsResponseControlClassTests (the complementary j8unit test
 *      interface containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface PagedResultsResponseControlTests<SUT extends javax.naming.ldap.PagedResultsResponseControl>
extends BasicControlTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.naming.ldap.PagedResultsResponseControl#getResultSize() public int
     * javax.naming.ldap.PagedResultsResponseControl.getResultSize()}.
     *
     * <p>
     * Test method for {@link javax.naming.ldap.PagedResultsResponseControl#getResultSize() public int
     * javax.naming.ldap.PagedResultsResponseControl.getResultSize()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.naming.ldap.PagedResultsResponseControl#getResultSize() public int
     *      javax.naming.ldap.PagedResultsResponseControl.getResultSize() (the hereby targeted method-under-test)
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

    /**
     * <p>
     * Test method for {@link javax.naming.ldap.PagedResultsResponseControl#getCookie() public byte[]
     * javax.naming.ldap.PagedResultsResponseControl.getCookie()}.
     *
     * <p>
     * Test method for {@link javax.naming.ldap.PagedResultsResponseControl#getCookie() public byte[]
     * javax.naming.ldap.PagedResultsResponseControl.getCookie()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.naming.ldap.PagedResultsResponseControl#getCookie() public byte[]
     *      javax.naming.ldap.PagedResultsResponseControl.getCookie() (the hereby targeted method-under-test)
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

}
