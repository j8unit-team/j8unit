package org.j8unit.repository.java.net;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.net.URLClassLoader class java.net.URLClassLoader}. The complementary
 * j8unit test interface containing the class relevant aspects is {@link URLClassLoaderClassTests}.
 * </p>
 *
 * @see java.net.URLClassLoader class java.net.URLClassLoader (the hereby targeted class-under-test class)
 * @see URLClassLoaderClassTests URLClassLoaderClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface URLClassLoaderTests<SUT extends java.net.URLClassLoader>
extends org.j8unit.repository.java.io.CloseableTests<SUT>, org.j8unit.repository.java.security.SecureClassLoaderTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.net.URLClassLoader#findResource(String) public java.net.URL
     * java.net.URLClassLoader.findResource(java.lang.String)}.
     *
     * <p>
     * Test method for {@link java.net.URLClassLoader#findResource(String) public java.net.URL
     * java.net.URLClassLoader.findResource(java.lang.String)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.net.URLClassLoader#findResource(String) public java.net.URL
     *      java.net.URLClassLoader.findResource(java.lang.String) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_findResource_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.net.URLClassLoader#getResourceAsStream(String) public java.io.InputStream
     * java.net.URLClassLoader.getResourceAsStream(java.lang.String)}.
     *
     * <p>
     * Test method for {@link java.net.URLClassLoader#getResourceAsStream(String) public java.io.InputStream
     * java.net.URLClassLoader.getResourceAsStream(java.lang.String)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.net.URLClassLoader#getResourceAsStream(String) public java.io.InputStream
     *      java.net.URLClassLoader.getResourceAsStream(java.lang.String) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getResourceAsStream_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.net.URLClassLoader#findResources(String) public java.util.Enumeration
     * <java.net.URL> java.net.URLClassLoader.findResources(java.lang.String) throws java.io.IOException}.
     *
     * <p>
     * Test method for {@link java.net.URLClassLoader#findResources(String) public java.util.Enumeration
     * java.net.URLClassLoader.findResources(java.lang.String) throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.net.URLClassLoader#findResources(String) public java.util.Enumeration
     *      java.net.URLClassLoader.findResources(java.lang.String) throws java.io.IOException (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_findResources_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.net.URLClassLoader#getURLs() public java.net.URL[] java.net.URLClassLoader.getURLs()}
     * .
     *
     * <p>
     * Test method for {@link java.net.URLClassLoader#getURLs() public java.net.URL[] java.net.URLClassLoader.getURLs()}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.net.URLClassLoader#getURLs() public java.net.URL[] java.net.URLClassLoader.getURLs() (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getURLs()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.net.URLClassLoader#close() public void java.net.URLClassLoader.close() throws
     * java.io.IOException}.
     *
     * <p>
     * Test method for {@link java.net.URLClassLoader#close() public void java.net.URLClassLoader.close() throws
     * java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.net.URLClassLoader#close() public void java.net.URLClassLoader.close() throws java.io.IOException (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_close()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
