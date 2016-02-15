package org.j8unit.repository.java.net;

import org.j8unit.repository.RepositoryTests;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.net.CookiePolicy interface java.net.CookiePolicy}. The complementary
 * j8unit test interface containing the class relevant aspects is {@link CookiePolicyClassTests}.
 * </p>
 *
 * @see java.net.CookiePolicy interface java.net.CookiePolicy (the hereby targeted class-under-test class)
 * @see CookiePolicyClassTests CookiePolicyClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface CookiePolicyTests<SUT extends java.net.CookiePolicy>
extends RepositoryTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.net.CookiePolicy#shouldAccept(java.net.URI, java.net.HttpCookie) public abstract
     * boolean java.net.CookiePolicy.shouldAccept(java.net.URI,java.net.HttpCookie)}.
     *
     * <p>
     * Test method for {@link java.net.CookiePolicy#shouldAccept(java.net.URI, java.net.HttpCookie) public abstract
     * boolean java.net.CookiePolicy.shouldAccept(java.net.URI,java.net.HttpCookie)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.net.CookiePolicy#shouldAccept(java.net.URI, java.net.HttpCookie) public abstract boolean
     *      java.net.CookiePolicy.shouldAccept(java.net.URI,java.net.HttpCookie) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_shouldAccept_URI_HttpCookie()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
