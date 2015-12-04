package org.j8unit.repository.java.net;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link java.net.CookieManager class java.net.CookieManager}, containing all instance relevant test
 * methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.net.CookieManagerClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface CookieManagerTests<SUT extends java.net.CookieManager>
extends org.j8unit.repository.java.net.CookieHandlerTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.net.CookieManager#get(java.net.URI,java.util.Map) public java.util.Map
     * java.net.CookieManager.get(java.net.URI,java.util.Map) throws java.io.IOException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_get_URI_Map()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.net.CookieManager#setCookiePolicy(java.net.CookiePolicy) public void
     * java.net.CookieManager.setCookiePolicy(java.net.CookiePolicy)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setCookiePolicy_CookiePolicy()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.net.CookieManager#put(java.net.URI,java.util.Map) public void
     * java.net.CookieManager.put(java.net.URI,java.util.Map) throws java.io.IOException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_put_URI_Map()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.net.CookieManager#getCookieStore() public java.net.CookieStore
     * java.net.CookieManager.getCookieStore()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getCookieStore()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
