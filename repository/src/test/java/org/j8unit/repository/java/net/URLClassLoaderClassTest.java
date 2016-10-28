package org.j8unit.repository.java.net;

import java.net.URL;
import java.net.URLClassLoader;
import java.net.URLStreamHandlerFactory;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class URLClassLoaderClassTest
implements org.j8unit.repository.java.net.URLClassLoaderClassTests<URLClassLoader> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.net.URLClassLoader]

    @Override
    public Class<URLClassLoader> createNewSUT() {
        return URLClassLoader.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link URLClassLoader#URLClassLoader(URL[], ClassLoader, URLStreamHandlerFactory) public
     * java.net.URLClassLoader(java.net.URL[],java.lang.ClassLoader,java.net.URLStreamHandlerFactory)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void create_URLClassLoader_URLArray_ClassLoader_URLStreamHandlerFactory()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final URLClassLoader sut = null; // = new URLClassLoader(URL[], ClassLoader, URLStreamHandlerFactory);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link URLClassLoader#URLClassLoader(URL[]) public
     * java.net.URLClassLoader(java.net.URL[])}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void create_URLClassLoader_URLArray()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final URLClassLoader sut = null; // = new URLClassLoader(URL[]);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link URLClassLoader#URLClassLoader(URL[], ClassLoader) public
     * java.net.URLClassLoader(java.net.URL[],java.lang.ClassLoader)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void create_URLClassLoader_URLArray_ClassLoader()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final URLClassLoader sut = null; // = new URLClassLoader(URL[], ClassLoader);
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link URLClassLoader#newInstance(URL[], ClassLoader)
     * public static java.net.URLClassLoader java.net.URLClassLoader.newInstance(java.net.URL[],java.lang.ClassLoader)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void test_newInstance_URLArray_ClassLoader()
    throws Exception {
        // write some test for {@link URLClassLoader#newInstance(URL[], ClassLoader)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link URLClassLoader#newInstance(URL[]) public static
     * java.net.URLClassLoader java.net.URLClassLoader.newInstance(java.net.URL[])}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void test_newInstance_URLArray()
    throws Exception {
        // write some test for {@link URLClassLoader#newInstance(URL[])}
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.net.URLClassLoader]

}
